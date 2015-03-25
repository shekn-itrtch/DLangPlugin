//* Statement from http://dlang.org/statement
void func1(int x)
{
    int x;    // illegal, x shadows parameter x

    int y;

    { int y; } // illegal, y shadows enclosing scope's y

    void delegate() dg;
    dg = { int y; }; // ok, this y is not in the same function

    struct S
    {
        int y;    // ok, this y is a member, not a local
    }

    { int z; }
    { int z; }  // ok, this z is not shadowing the other z

    { int t; }
    { t++;   }  // illegal, t is undefined
}

//Declaration
int a;        // declare a as type int and initialize it to 0
struct S { }  // declare struct s
alias myint = int;

//If Statement
if (auto m = std.regexp.search("abcdef", "b(c)d"))
{
    writefln("[%s]", m.pre);      // prints [a]
    writefln("[%s]", m.post);     // prints [ef]
    writefln("[%s]", m.match(0)); // prints [bcd]
    writefln("[%s]", m.match(1)); // prints [c]
    writefln("[%s]", m.match(2)); // prints []
}
else
{
    writeln(m.post);    // error, m undefined
}
writeln(m.pre);         // error, m undefined

//While statement
while (i < 10)
{
    foo(i);
    i++;
}

//Do..While expression
int i = 0;
do
{
    foo(i);
} while (++i < 10);

//For statement
for (int i = 0; i < 10; i++)
    foo(i);

for (int i = 0; i < 10; i++)
{
}

//Foreach
char[] a;
foreach (int i, char c; a)
{
    writefln("a[%d] = '%c'", i, c);
}

char[] a = "\xE2\x89\xA0".dup;  // \u2260 encoded as 3 UTF-8 bytes

foreach (dchar c; a)
{
    writefln("a[] = %x", c); // prints 'a[] = 2260'
}

dchar[] b = "\u2260"d.dup;

foreach (char c; b)
{
    writef("%x, ", c);  // prints 'e2, 89, a0, '
}

double[string] a; // index type is string, value type is double
//...
foreach (string s, double d; a)
{
    writefln("a['%s'] = %g", s, d);
}

foreach_reverse (e; range) {
 do_something();
}

foreach (i; 0 .. foo()) {
    write(i);
}

//Switch statement
int number;
string message;
switch (number)
{
    default:    // valid: ends with 'throw'
        throw new Exception("unknown number");

    case 3:     // valid: ends with 'break' (break out of the 'switch' only)
        message ~= "three ";
        break;

    case 4:     // valid: ends with 'continue' (continue the enclosing loop)
        message ~= "four ";
        continue;

    case 5:     // valid: ends with 'goto' (explicit fall-through to next case.)
        message ~= "five ";
        goto case;

    case 6:     // ERROR: implicit fall-through
        message ~= "six ";

    case 1:     // valid: the body is empty
    case 2:     // valid: this is the last case in the switch statement.
        message = "one or two";
    default:
        message = "default";
        break;
}

char[] name;
final switch (name)
{
    case "fred":
    case "sally":
        do_something(1);
}

//Break statement
for (i = 0; i < 10; i++)
{
    if (foo(i))
        break;
    if (bar(j))
        break mark;
}

//Goto statement
    if (foo)
        goto L1;
    x = 3;
L1:
    x++;

//With statement
struct Foo
{
    alias Y = int;
}
Y y;        // error, Y undefined
with (Foo)
{
    Y y;    // same as Foo.Y y;
}

//synchronized statement
synchronized { run_function(); }
synchronized (mutex1) { run_function(); }
synchronized (mutex2) run_function();

//Try, catch, throw Statements
try
{
    try
    {
        throw new Exception("first");
    }
    finally
    {
        writeln("finally");
        throw new Exception("second");
    }
}
catch (Exception e)
{
    writeln("catch %s", e.msg);
}

//Scope statement
write("1");
{
    write("2");
    scope(exit) write("3");
    scope(exit) write("4");
    write("5");
}
writeln();

try
{
    scope(exit) write("2");
    scope(success) write("3");
    scope Foo f = new Foo();
    scope(failure) write("4");
    throw new Exception("msg");
    scope(exit) write("5");
    scope(success) write("6");
    scope(failure) write("7");
}
catch (Exception e)
{
}

//Asm Statement
//XXX: Fix Asm statement and update this test
int x = 3;
asm
{
    aaa;
    aaa
    //mov EAX, x; // load x and put it in register EAX
}

//Pragma statement


//Mixin statement
int j;
mixin("
    int x = 3;
    for (int i = 0; i < 3; i++)
        writeln(x + i, ++j);
    ");    // ok

const char[] s = "int y;";
mixin(s);  // ok
y = 4;     // ok, mixin declared y

char[] t = "y = 3;";
mixin(t);  // error, t is not evaluatable at compile time

mixin("y =") 4; // error, string must be complete statement

mixin("y =" ~ "4;");  // ok
