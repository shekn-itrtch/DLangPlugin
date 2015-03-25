a = /* asdfasd** *f */ 1;    // parses as if 'a = 1;'
a = /+ " +/ " +/ 1" ; // parses as if 'a = " +/ 1";'
__abb = /+ 11 /* +/ */ 3; // parses as if 'a = */ 3;'

//Test nesting comments
/+ /+ 1 +2
text +/   +/

r"ab\n"c
`asdfasdf\\\`w  11122 ` 2 `
"Hello \&amp;"
"\xFAHello \&amp;"

testChar = 'a'

integerLiteral = 12345
integerLiteral = 12_3_45u
integerLiteral = 0x12_3_45Lu
'\&nbsp;'

//Integers
123_456       // 123456
1_2_3_4_5_6_  // 123456

//Floats
123_456.567_8         // 123456.5678
1_2_3_4_5_6_._5_6_7_8 // 123456.5678
1_2_3_4_5_6_._5e-6_   // 123456.5e-6

//Hex Floats
0x1.FFFFFFFFFFFFFp1023 // double.max
0x1p-52                // double.epsilon
1.175494351e-38F       // float.min
6.3i                   // idouble 6.3
6.3fi                  // ifloat 6.3
6.3Li                  // ireal 6.3

//Complex number
4.5 + 6.2i  // complex number (phased out)

//Keywords
abstract alias align
