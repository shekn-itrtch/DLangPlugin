// http://dlang.org/declaration.html
int x;    // x is an int
int* x;   // x is a pointer to int
int** x;  // x is a pointer to a pointer to int
int[] x;  // x is an array of ints
int*[] x; // x is an array of pointers to ints
int[]* x; // x is a pointer to an array of ints

int[3] x;     // x is an array of 3 ints
int[3][5] x;  // x is an array of 5 arrays of 3 ints
int[3]*[5] x; // x is an array of 5 pointers to arrays of 3 ints

int function(char) x; // x is a pointer to
                     // a function taking a char argument
                     // and returning an int
int function(char)[] x; // x is an array of
                     // pointers to functions
                     // taking a char argument
                     // and returning an int

int x[3];          // x is an array of 3 ints
int x[3][5];       // x is an array of 3 arrays of 5 ints
int (*x[5])[3];    // x is an array of 5 pointers to arrays of 3 ints
int (*x)(char);    // x is a pointer to a function taking a char argument
                   // and returning an int
int (*[] x)(char); // x is an array of pointers to functions
                   // taking a char argument and returning an int
int x,y;   // x and y are ints
int* x,y;  // x and y are pointers to ints
//int x,*y;  // error, multiple types
int[] x,y; // x and y are arrays of ints
int x[],y; // error, multiple types

//AutoDeclaration:
static x = 3;      // x is type int
auto y = 4u;       // y is type uint

auto s = "string"; // s is type immutable(char)[]

class C { /* Class content */ }

auto c = new C();  // c is a handle to an instance of class C

//Alias Declarations
alias myint = abc.Foo.bar;

import string;
alias mylen = string.strlen;
int len = mylen("hello"); // actually calls string.strlen()

template Foo2(T) { alias t = T; }
alias t1 = Foo2!(int);
alias t2 = Foo2!(int).t;
alias t3 = t1.t;
alias t4 = t2;

t1.t v1;  // v1 is type int
t2 v2;    // v2 is type int
t3 v3;    // v3 is type int
t4 v4;    // v4 is type int

version (Win32)
{
    alias myfoo = win32.foo;
}
version (linux)
{
    alias myfoo = linux.bar;
}

//Extern Declarations
extern(C) int foo;        // variable allocated and initialized in this module with C linkage
extern extern(C) int bar; // variable allocated outside this module with C linkage
                          // (e.g. in a statically linked C library or another module)

//typeof
void func(int i)
{
    typeof(i) j;       // j is of type int
    typeof(3 + 6.0) x; // x is of type double
    typeof(1)* p;      // p is of type pointer to int
    int[typeof(p)] a;  // a is of type int[int*]

    writefln("%d", typeof('c').sizeof); // prints 1
    double c = cast(typeof(1.0))j; // cast j to double
}

class A { }

class B : A
{
    typeof(this) x;  // x is declared to be a B
    typeof(super) y; // y is declared to be an A
}

struct C
{
    static typeof(this) z;  // z is declared to be a C

    typeof(super) q; // error, no super struct for C
}

typeof(this) r;   // error, no enclosing struct or class

//Void Initializations
void foo()
{
    int x = void;
    writeln(x);  // will print garbage
}
