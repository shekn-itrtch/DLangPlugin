//http://dlang.org/expression.html
import std.conv;
int i = 0;
assert(text(++i, ++i) == "12"); // left to right evaluation of arguments

char[][] foo;   // dynamic array of strings
foo = new char[][30]; // allocate array of 30 strings
foo = new char[][](30); // allocate array of 30 strings

int[][][] bar;
bar = new int[][][](5,20,30);

//Cast
cast(foo) -p; // cast (-p) to type foo
(foo) - p;      // subtract p from foo

//
class A { }
class B : A { }

void test(A a, B b)
{
    B bx = a;         // error, need cast
    B bx = cast(B) a; // bx is null if a is not a B
    A ax = b;         // no cast needed
    A ax = cast(A) b; // no runtime check needed for upcast
}

int main()
{
    byte[] a = [1,2,3];
    auto b = cast(int[])a; // runtime array cast misalignment

    int[] c = [1, 2, 3];
    auto d = cast(byte[])c; // ok
    // prints:
    // [1, 0, 0, 0, 2, 0, 0, 0, 3, 0, 0, 0]
    writeln(d);
    return 0;
}

void test()
{
    real a = 3.40483L;
    real b;
    b = 3.40483;     // literal is not truncated to double precision
    assert(a == b);
    assert(a == 3.40483);
    assert(a == 3.40483L);
    assert(a == 3.40483F);
    double d = 3.40483; // truncate literal when assigned to variable
    assert(d != a);     // so it is no longer the same
    const double x = 3.40483; // assignment to const is not
    assert(x == a);     // truncated if the initializer is visible
}

shared int x;
assert(is(typeof(cast(const)x) == const int));

shared int x;
assert(is(typeof(cast()x) == int));

void foo(lazy void exp) {}
void main()
{
    foo(10);            // NG - has no effect in expression '10'
    foo(cast(void)10);  // OK
}

//This
class A
{
    char get() { return 'A'; }

    char foo() { return typeof(this).get(); }
    char bar() { return this.get(); }
}

class B : A
{
    char get() { return 'B'; }
}

void main()
{
    B b = new B();

    b.foo();  // returns 'A'
    b.bar();  // returns 'B'
}

//Array Literals
[1,2,3];  // type is int[3], with elements 1, 2 and 3
[1u,2,3]; // type is uint[3], with elements 1u, 2u, and 3u

//Associative Array Literals
[21u:"he",38:"ho",2:"hi"]; // type is char[2][uint],
                           // with keys 21u, 38u and 2u
                           // and values "he", "ho", and "hi"

//Function Literals
int function(char c) fp;

void test()
{
    fp = function int(char c) { return 6;} ;
}

int abc(int delegate(int i));

void test()
{
    int b = 3;

    abc( delegate int(int c) { return 6 + b; } );
}

void foo(int function(int) fp);

void test()
{
    int function(int) fp = (n) { return n * 2; };
    // The type of parameter n is inferred to int.

    foo((n) { return n * 2; });
    // The type of parameter n is inferred to int.
}

double test()
{
    double d = 7.6;
    float f = 2.3;

    void loop(int k, int j, void delegate() statement)
    {
        for (int i = k; i < j; i++)
        {
            statement();
        }
    }

    loop(5, 100, { d += 1; });
    loop(3, 10,  { f += 3; });

    return d + f;
}

//Lambdas
void main()
{
    auto i = 3;
    auto twice  = function (int x) => x * 2;
    auto square = delegate (int x) => x * x;

    auto n = 5;
    auto mul_n = (int x) => x * n;

    writeln(twice(i));   // prints 6
    writeln(square(i));  // prints 9
    writeln(mul_n(i));   // prints 15
}

//AssertExpression
return assert(0, "an" ~ " error message");

//Mixin expression
return mixin("x + 1") * 7;  // same as ((x + 1) * 7)
