//http://dlang.org/attribute.html

extern (C):
  int foo(); // call foo() with C conventions

extern (D):
  int bar(); // call bar() with D conventions

extern (Windows):
  void *VirtualAlloc(
    void *lpAddress,
    uint dwSize,
    uint flAllocationType,
    uint flProtect
    );

extern (C++, N) { void foo(); }

//align Attribute
align(2) struct S {
  align (1):
     byte a;   // placed at offset 0
     int b;    // placed at offset 4
     long c;   // placed at offset 8
}

auto sz = S.sizeof;  // 16

//deprecated Attribute
deprecated("Don't use bar") void oldBar();
oldBar();   // Deprecated: function test.oldBar is deprecated - Don't use bar

//Const attribute
const int foo = 7;
static assert(is(typeof(foo) == const int));

const {
  double bar = foo + 6;
}

int foo() {
  __gshared int bar = 0;
  return bar++; // Not thread safe.
}

//Disabled attribute
@disable void foo() { }

void main() {
  foo();   // error, foo is disabled
}

//nogc attribute
void function() @nogc gp;  // pointer to @nogc function
@nogc void bar();

//Pragmas test
pragma(ident);        // just by itself

pragma(ident) declaration; // influence one declaration

pragma(ident): // influence subsequent declarations
    declaration;
    declaration;

pragma(ident) { // influence block of declarations
    declaration;
    declaration;
}

pragma(ident) statement; // influence one statement

pragma(ident) { // influence block of statements
    statement;
    statement;
}

pragma(msg, "compiling...", 1, 1.0);

pragma(mangle, "body")
extern(C) void body_func();

//Property
struct S
{
    int m_x;
    @property ref int x() { return m_x; }
}
