module package1.package2;
module c.stdio; // module stdio in the c package

import std.stdio; // import module stdio from package std
import foo, bar;  // import modules foo and bar
static import std.stdio;
import io = std.stdio;
import io = std.stdio : foo = writeln; //Renamed and Selective Imports
import std.stdio : writeln, foo = write; //Selective Imports

//Declarations test
int* x;   // x is a pointer to int
int x;    // x is an int
uint** x;  // x is a pointer to a pointer to int
int[] x;  // x is an array of ints
int*[] x; // x is an array of pointers to ints
int[]* x; // x is a pointer to an array of ints

//AssignExpression in declarations test
int[3] x;     // x is an array of 3 ints
int[3][5] x;  // x is an array of 5 arrays of 3 ints
int[3]*[5] x; // x is an array of 5 pointers to arrays of 3 in

int function(char) x; // x is a pointer to
                     // a function taking a char argument
                     // and returning an int
int function(char)[] x; // x is an array of
                     // pointers to functions
                     // taking a char argument
                     // and returning an int

//AssignExpression in declarations test
int x[3];          // x is an array of 3 ints
int x[3][5];       // x is an array of 3 arrays of 5 ints
int (*x[5])[3];    // x is an array of 5 pointers to arrays of 3 ints
int (*x)(char);    // x is a pointer to a function taking a char argument
                   // and returning an int
int (*[] x)(char); // x is an array of pointers to functions
                   // taking a char argument and returning an int

//In a declaration declaring multiple symbols, all the declarations must be of the same type:
int x,y;   // x and y are ints
int* x,y;  // x and y are pointers to ints
int x,*y;  // error, multiple types
int[] x,y; // x and y are arrays of ints
int x[],y; // error, multiple types


//Initializer rule tests.
static x = 3;      // x is type int
auto y = 4u;       // y is type uint
auto s = "string"; // s is type immutable(char)[]
class C { /* */ }
auto c = new C();  // c is a handle to an instance of class C

alias string.strlen mylen;
alias int myint;

//Template alias rules are implemented
alias Foo2!(int) t1;
alias Foo2!(int).t t2;
alias t1.t t3;
alias t2 t4;

//Extern Declarations
extern(C) int foo;  // variable allocated and initialized in this module with C linkage
extern extern(C) int bar; // variable allocated outside this module with C linkage
                          // (e.g. in a statically linked C library or another module)

//Typeof is a way to specify a type based on the type of an expression. For example:
typeof(return) j;       // j is of type int
typeof(this) j;         // j is of type int
int[typeof(return)] a;  // a is of type int[int*]
int[typeof(super)] a;   // a is of type int[int*]

typeof(i) j;
typeof(3 + 6.0) x; // x is of type double
typeof(1)* p;      // p is of type pointer to int
int[typeof(p)] a;  // a is of type int[int*]
