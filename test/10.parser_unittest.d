// http://dlang.org/unittest.html

class Sum
{
    int add(int x, int y) { return x + y; }

    unittest
    {
        Sum sum = new Sum;
        assert(sum.add(3,4) == 7);
        assert(sum.add(-2,0) == -2);
    }
}

/// add function
int add(int x, int y) { return x + y; }

/// code sample generated
unittest
{
    assert(add(1, 1) == 2);
}

/// code sample not generated because the unittest is private
private unittest
{
    assert(add(2, 2) == 4);
}

unittest
{
    /// code sample not generated because the unittest isn't documented
    assert(add(3, 3) == 6);
}

/// code sample generated, even if it only includes comments (or is empty)
unittest
{
    /** assert(add(4, 4) == 8); */
}

