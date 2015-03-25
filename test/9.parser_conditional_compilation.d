//http://dlang.org/version.html
int k;
version (Demo) // compile in this code block for the demo version
{
    int i;
    int k;    // error, k already defined

    i = 3;
}
x = i;      // uses the i declared above

//"else" clause
version (X86)
{
    // implement custom inline assembler version
}
else
{
    // use default, but slow, version
}

version (ProfessionalEdition)
{
    version = FeatureA;
    version = FeatureB;
    version = FeatureC;
}
version (HomeEdition)
{
    version = FeatureA;
}

version (FeatureB)
{
    //... implement Feature B ...
}

//Here's an example of a full version as opposed to a demo version:
class Foo
{
    int a, b;

    version(full)
    {
        int extrafunctionality()
        {
            return 1;  // extra functionality is supported
        }
    }
    else // demo
    {
        int extrafunctionality()
        {
            return 0;  // extra functionality is not supported
        }
    }
}

//Debug Condition

class Foo
{
    int a, b;
debug:
    int flag;
}

debug(IntegerLiteral) { } // add in debug code if debug level is >= IntegerLiteral
debug(somIdentifier) { } // add in debug code if debug keyword is identifier

//Static If Condition
const int i = 3;
int j = 4;

static if (i == 3)    // ok, at module scope
    int x;

class C
{
    const int k = 5;

    static if (i == 3) // ok
        int x;
    else
        long x;

    static if (j == 3) // error, j is not a constant
        int y;

    static if (k == 5) // ok, k is in current scope
        int z;
}

template INT(int i)
{
    static if (i == 32)
        alias INT = int;
    else static if (i == 16)
        alias INT = short;
    else
        static assert(0); // not supported
}

INT!(32) a;  // a is an int
INT!(16) b;  // b is a short
INT!(17) c;  // error, static assert trips

//Static Assert
void foo()
{
    if (0)
    {
        assert(0);  // never trips
        static assert(0); // always trips
    }
    version (BAR)
    {
    }
    else
    {
        static assert(0); // trips when version BAR is not defined
    }
}
