// http://dlang.org/template.html
module parser_templates;

//Once instantiated, the declarations inside the template, called the template members, are in the scope of the TemplateInstance:
template TFoo(T) { alias t = T*; }
TFoo!(int).t x; // declare x to be of type int*

//If the TemplateArgument is one token long, the parentheses can be omitted:
TFoo!int.t x;   // same as TFoo!(int).t x;

//A template instantiation can be aliased:
template TFoo(T) { alias t = T*; }
alias abc = TFoo!(int);
abc.t x;        // declare x to be of type int*

//Multiple instantiations of a TemplateDeclaration with the same TemplateArgumentList all will refer to the same instantiation. For example:
template TFoo(T) { T f; }
alias a = TFoo!(int);
alias b = TFoo!(int);

a.f = 3;
assert(b.f == 3);  // a and b refer to the same instance of TFoo

//Even if template arguments are implicitly converted to the same template parameter type, they still refer to same instance:
struct TFoo(int x) { }

// 3 and 2+1 are both 3 of type int
static assert(is(TFoo!(3) == TFoo!(2 + 1)));

// 3u is implicitly converted to 3 to match int parameter,
// and refers exactly same instance with TFoo!(3).
static assert(is(TFoo!(3) == TFoo!(3u)));

//Argument Deduction

template TFoo(T) { }
alias Foo1 = TFoo!(int);     // (1) T is deduced to be int
alias Foo2 = TFoo!(char*);   // (1) T is deduced to be char*

template TBar(T : T*) { }
alias Foo3 = TBar!(char*);   // (2) T is deduced to be char

template TAbc(D, U : D[]) { }
alias Bar1 = TAbc!(int, int[]);  // (2) D is deduced to be int, U is int[]
alias Bar2 = TAbc!(char, int[]); // (4) error, D is both char and int

template TDef(D : E*, E) { }
alias Bar3 = TDef!(int*, int); // (1) E is int
                               // (3) D is int*
//Deduction from a specialization can provide values for more than one parameter:
template Foo(T: T[U], U)
{
  //Some code
}

auto instance = Foo!(int[long]);  // instantiates Foo with T set to int, U set to long

//When considering matches, a class is considered to be a match for any super classes or interfaces:
class A { }
class B2 : A { }

template TFoo(T : A) { }
alias Foo4 = TFoo!(B);     // (3) T is B

template TBar(T : U*, U : A) { }
alias Foo5 = TBar!(B*, B); // (2) T is B*
                           // (3) U is B

//Specialization
//Templates may be specialized for particular types of arguments by following the template parameter identifier with a : and the specialized type. For example:
template TFoo(T)        {  } // #1
template TFoo(T : T[])  {  } // #2
template TFoo(T : char) {  } // #3
template TFoo(T, U, V)  {  } // #4

alias foo1 = TFoo!(int);            // instantiates #1
alias foo2 = TFoo!(double[]);       // instantiates #2 with T being double
alias foo3 = TFoo!(char);           // instantiates #3
alias fooe = TFoo!(char, int);      // error, number of arguments mismatch
alias foo4 = TFoo!(char, int, int); // instantiates #4

//Template This Parameters
struct S
{
    const void foo(this T)(int i)
    {
        writeln(typeid(T));
    }
}

void main()
{
    const(S) s;
    (&s).foo(1);
    S s2;
    s2.foo(2);
    immutable(S) s3;
    s3.foo(3);
}

interface Addable(T)
{
    final R add(this R)(T t)
    {
        return cast(R)this;  // cast is necessary, but safe
    }
}

class List(T) : Addable!T
{
    List remove(T t)
    {
        return this;
    }
}

void main()
{
    auto list = new List!int;
    list.add(1).remove(1);  // ok
}

//Template Value Parameters
template foo(string s)
{
    string bar() { return s ~ " betty"; }
}

void main()
{
    writefln("%s", foo!("hello").bar()); // prints: hello betty
}

template foo(U : int, int T : 10)
{
    U x = T;
}

void main()
{
    assert(foo!(int, 10).x == 10);
}

//Template Alias Parameters
//Global names
int x;

template Foo(alias X)
{
    static int* p = &X;
}

void test()
{
    alias bar = Foo!(x);
    *bar.p = 3;       // set x to 3
    static int y;
    alias abc = Foo!(y);
    *abc.p = 3;       // set y to 3
}

//Type names
class Foo
{
    static int p;
}

template Bar(alias T)
{
    alias q = T.p;
}

void test()
{
    alias bar = Bar!(Foo);
    bar.q = 3;  // sets Foo.p to 3
}

//Module names
import std.string;

template Foo(alias X)
{
    alias y = X.toString;
}

void test()
{
    alias bar = Foo!(std.string);
    bar.y(3);   // calls std.string.toString(3)
}

//Template names
int x;

template Foo(alias X)
{
    static int* p = &X;
}

template Bar(alias T)
{
    alias abc = T!(x);
}

void test()
{
    alias bar = Bar!(Foo);
    *bar.abc.p = 3;  // sets x to 3
}

//Template alias names
int x;

template Foo(alias X)
{
    static int* p = &X;
}

template Bar(alias T)
{
    alias q = T.p;
}

void test()
{
    alias foo = Foo!(x);
    alias bar = Bar!(foo);
    *bar.q = 3;  // sets x to 3
}

//Literals
template Foo(alias X, alias Y)
{
    static int i = X;
    static string s = Y;
}

void test()
{
    alias foo = Foo!(3, "bar");
    writeln(foo.i, foo.s);  // prints 3bar
}

//Typed alias parameters
template Foo(alias int x) { }
int x;
float f;

Foo!x;  // ok
Foo!f;  // fails to instantiate

//Alias parameters can accept both literals and user-defined type symbols, but they are less specialized than the matches to type parameters and value parameters:
template Foo(T)         { }  // #1
template Foo(int n)     { }  // #2
template Foo(alias sym) { }  // #3

struct S {}
int var;

alias foo1  = Foo!(S);      // instantiates #1
alias foo2  = Foo!(1);      // instantiates #2
alias foo3a = Foo!([1,2]);  // instantiates #3
alias foo3b = Foo!(var);    // instantiates #3

//
template Bar(alias A) { }                 // #4
template Bar(T : U!V, alias U, V...) { }  // #5

class C(T) {}
alias bar = Bar!(C!int);    // instantiates #5

//Template Tuple Parameters
template Print(args...)
{
    void print()
    {
        writeln("args are ", args); // args is an ExpressionTuple
    }
}

template Write(Args...)
{
    void write(Args args) // Args is a TypeTuple
                          // args is an ExpressionTuple
    {
        writeln("args are ", args);
    }
}

void main()
{
    Print!(1,'a',6.8).print();                    // prints: args are 1a6.8
    Write!(int, char, double).write(1, 'a', 6.8); // prints: args are 1a6.8
}

//Template tuples can also be deduced from the type of a delegate or function parameter list passed as a function argument:
/* Partially applies a delegate by tying its first argument to a particular value.
 * R = return type
 * T = first argument type
 * Args = TypeTuple of remaining argument types
 */
R delegate(Args) partial(R, T, Args...)(R delegate(T, Args) dg, T first)
{
      // return a closure
      return (Args args) => dg(first, args);
}

void main()
{
      int plus(int x, int y, int z)
      {
          return x + y + z;
      }

      auto plus_two = partial(&plus, 2);
      writefln("%d", plus_two(6, 8)); // prints 16
}

//Specialization

//If both a template with a tuple parameter and a template without a tuple parameter exactly match a template instantiation, the template without a TemplateTupleParameter is selected.
template Foo(T)         { pragma(msg, "1"); }   // #1
template Foo(int n)     { pragma(msg, "2"); }   // #2
template Foo(alias sym) { pragma(msg, "3"); }   // #3
template Foo(Args...)   { pragma(msg, "4"); }   // #4

// Any sole template argument will never match to #4
alias foo1 = Foo!(int);          // instantiates #1
alias foo2 = Foo!(3);            // instantiates #2
alias foo3 = Foo!(std);          // instantiates #3

alias foo4 = Foo!(int, 3, std);  // instantiates #4

//Template Parameter Default Values
template Foo(T, U = int) { }
Foo!(uint,long); // instantiate Foo with T as uint, and U as long
Foo!(uint);      // instantiate Foo with T as uint, and U as int

template Foo(T, U = T*) { }
Foo!(uint);      // instantiate Foo with T as uint, and U as uint*

//Implicit Template Properties
template Foo(T)
{
    T Foo; // declare variable Foo of type T
}

void test()
{
    Foo!(int) = 6; // instead of Foo!(int).Foo
}

//Aggregate Templates
class Bar(T)
{
    T member;
}

//Function Templates
T Square(T)(T t)
{
    return t * t;
}
writefln("The square of %s is %s", 3, Square(3));  // T is deduced to be int

void Foo(T, U=T*)(T t) { U p; }

int x;
Foo(x);    // T is int, U is int*

//The deduced type parameter for dynamic array and pointer arguments has an unqualified head:
void foo(T)(T arg) { pragma(msg, T); }

int[] marr;
const(int[]) carr;
immutable(int[]) iarr;
foo(marr);  // T == int[]
foo(carr);  // T == const(int)[]
foo(iarr);  // T == immutable(int)[]

int* mptr;
const(int*) cptr;
immutable(int*) iptr;
foo(mptr);  // T == int*
foo(cptr);  // T == const(int)*
foo(iptr);  // T == immutable(int)*

auto Square(T)(T t)
{
    return t * t;
}

//Variable Templates
//Same as aggregates and functions, variable declarations with Initializer can have optional template parameters:
enum string constant(TL...) = TL.stringof;
ubyte[T.sizeof] storage(T) = 0;
auto array(alias a) = a;

alias Sequence(TL...) = TL;

//Function Templates with Auto Ref Parameters
int foo(Args...)(auto ref Args args)
{
    int result;

    foreach (i, v; args)
    {
        if (v == 10)
            trololo();
            //assert(__traits(isRef, args[i])); //Uncomment when traits rules are implemented
        else
            //assert(!__traits(isRef, args[i])); //Uncomment when traits rules are implemented
            tralala();
        result += v;
    }
    return result;
}

void main()
{
    int y = 10;
    int r;
    r = foo(8);       // returns 8
    r = foo(y);       // returns 10
    r = foo(3, 4, y); // returns 17
    r = foo(4, 5, y); // returns 19
    r = foo(y, 6, y); // returns 26
}

//Nested Templates
class C
{
    int num;
    this(int n) { num = n; }

    class N(T)
    {
        // instantiated class N!T can become nested in C
        T foo() { return num * 2; }
    }
}

void main()
{
    auto c = new C(10);
    auto n = c.new N!int();
    assert(n.foo() == 20);
}

//A templated struct can become a nested struct if it is instantiated with a local symbol passed as an aliased argument:
struct A(alias F)
{
    int fun(int i) { return F(i); }
}

A!F makeA(alias F)() { return A!F(); }

void main()
{
    int x = 40;
    int fun(int i) { return x + i; }
    A!fun a = makeA!fun();
    assert(a.fun(2) == 42);
}

//Recursive Templates

template factorial(int n : 1)
{
    enum { factorial = 1 }
}

template factorial(int n)
{
    enum { factorial = n* factorial!(n-1) }
}

void test()
{
    writefln("%s", factorial!(4)); // prints 24
}

//Template Constraints
void foo(int N)()
    if (N & 1)
{
    //...
}
//...
foo!(3)();  // ok, matches
foo!(4)();  // error, no match

import std.stdio;

class D : StdioException {
}
