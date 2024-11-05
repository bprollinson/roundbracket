# RoundBracket

## Type system

RoundBracket supports the following types:

### Boolean

A true or false value.

### Integer

A whole number, such a -120, 0, or 9000.

### Float

A floating-point number, such as -12.6, 0.0 or 921.910.

### Character

A single character, such as a, 0, or *.

### String

A sequence of characters, such as "", "test", "0123" or "!@#$%".

## Boolean value methods

### true()

Arguments: None\
Return type: bool\
Return value: true

### false()

Arguments: None\
Return type: bool\
Return value: false

## Integer value methods

### zero()

Arguments: None\
Return type: int\
Return value: 0

### one()

Arguments: None\
Return type: int\
Return value: 1

### two()

Arguments: None\
Return type: int\
Return value: 2

### three()

Arguments: None\
Return type: int\
Return value: 3

### four()

Arguments: None\
Return type: int\
Return value: 4

### five()

Arguments: None\
Return type: int\
Return value: 5

### six()

Arguments: None\
Return type: int\
Return value: 6

### seven()

Arguments: None\
Return type: int\
Return value: 7

### eight()

Arguments: None\
Return type: int\
Return value: 8

### nine()

Arguments: None\
Return type: int\
Return value: 9

### ten()

Arguments: None\
Return type: int\
Return value: 10

## Variable storage and retrieval methods

### get_bool()

Arguments: slot_num: int\
Return type: bool\
Return value: The value previously stored in bool slot slot_num

### set_bool()

Arguments: slot_num: int, value: bool\
Return type: void\
Return value: N/A\
Side effects: Stores value in bool slot slot_num

### bool_is_set()

Arguments: slot_num: int\
Return type: bool\
Return value: true if a value has been stored in bool slot slot_num, otherwise false

### get_int()

Arguments: slot_num: int\
Return type: int\
Return value: The value previously stored in int slot_num

### set_int()

Arguments: slot_num: int, value: int\
Return type: void\
Return value: N/A\
Side effects: Stores value in int slot slot_num

### int_is_set()

Arguments: slot_num: int\
Return type: bool\
Return value: true if a value has been stored in int slot slot_num, otherwise false

### get_float()

Arguments: slot_num: int\
Return type: float\
Return value: The value previously stored in float slot slot_num

### set_float()

Arguments: slot_num: int, value: float\
Return type: void\
Return value: N/A\
Side effects: Stores value in float slot slot_num

### float_is_set()

Arguments: slot_num: int\
Return type: bool\
Return value: true if a value has been stored in float slot slot_num, otherwise false

### get_char()

Arguments: slot_num: int\
Return type: char\
Return value: The value previously stored in char slot slot_num

### set_char()

Arguments: slot_num: int, value: char\
Return type: void\
Return value: N/A\
Side effects: Stores value in char slot slot_num

### char_is_set()

Arguments: slot_num: int\
Return type: bool\
Return value: true if a value has been stored in char slot slot_num, otherwise false

### get_string()

Arguments: slot_num: int\
Return type: string\
Return value: The value previously stored in string slot_num

### set_string()

Arguments: slot_num: int, value: string\
Return type: void\
Return value: N/A\
Side effects: Stores value in string slot slot_num

### string_is_set()

Arguments: slot_num: int\
Return type: bool\
Return value: true if a value has been stored in string slot slot_num, otherwise false

## Type conversion methods

### int_to_float()

Arguments: i: int\
Return type: float\
Return value: i as a float

### int_to_string()

Arguments: i: int\
Return type: string\
Return value: i as a string

### float_to_string()

Arguments: f: float\
Return type: string\
Return value: f as a string

### char_to_int()

Arguments: c: char\
Return type: int\
Return value: The ascii value of c

### char_to_string()

Arguments: c: char\
Return type: string\
Return value: c as a string

### string_is_int()

Arguments: s: string\
Return type: bool\
Return value: true if s is an integer string, false otherwise

### string_to_int()

Arguments: s: string\
Return type: int\
Return value: s as an integer\
Side effects: Generates an error if s is not an integer string

### string_is_float()

Arguments: s: string\
Return type: bool\
Return value: true if s is a float string, false otherwise

### string_to_float()

Arguments: s: string\
Return type: float\
Return value: s as a float\
Side effects: Generates an error if s is not a float strings

## Boolean operator methods

### not()

Arguments: a: bool\
Return type: bool\
Return value: The boolean negation of a

### and()

Arguments: a: bool, b: bool\
Return type: bool\
Return value: true if both a and b are true, otherwise false

### or()

Arguments: a: bool, b: bool\
Return type: bool\
Return value: true if at least one of a or b is true, otherwise false

## Integer mathematical methods

### minus_int()

Arguments: a: int\
Return type: int\
Return value: -a

### add_int()

Arguments: a: int, b: int\
Return type: int\
Return value: a + b

### subtract_int()

Arguments: a: int, b: int\
Return type: int\
Return value: a - b

### multiply_int()

Arguments: a: int, b: int\
Return type: int\
Return value: a * b

### divide_int()

Arguments: a: int, b: int\
Retrun type: int\
Return value: floor(a / b), i.e. the integer component of a / b

## Floating-point mathematical methods

### minus_float()

Arguments: a: float\
Return type: float\
Return value: -a

### add_float()

Arguments: a: float, b: float\
Return type: float\
Return value: a + b

### subtract_float()

Arguments: a: float, b: float\
Return type: float\
Return value: a - b

### multiply_float()

Arguments: a: float, b: float\
Return type: float\
Return value: a * b

### divide_float()

Arguments: a: float, b: float\
Return type: float\
Return value: a / b

### floor()

Arguments: a: float\
Return type: int\
Return value: The largest int no greater than a

### round()

Arguments: a: float\
Return type: int\
Return value: The integer closest to a, rounding on conflict

### ceiling()

Arguments: a: float\
Return type: int\
Return value: The largest int no less than a

## String operator methods

### empty_str()

Arguments: None\
Return type: str\
Return value: The empty string ("")

### str_length()

Arguments: a: str\
Return type: int\
Return value: The length of a

### concat_str()

Arguments: a: str, b: str\
Return type: str\
Return value: a concatenated with b

### concat_char()

Arguments: a: str, c: char\
Return type: str\
Return value: a concatenated with c

### str_char()

Arguments: a: str, i: int\
Return type: char\
return value: The ith character from a

## Program flow methods

### if()

Arguments: b: bool\
Return type: void\
Return value: N/A\
Side effects: Begins the if control flow, executing the subsequent block if b is true or jumping to else_if / else / end_if if b is false

### else_if()

Arguments: b: bool\
Return type: void\
Return value: N/A\
Side effects: Continues the control flow from the previous if or else_if method, executing the subsequent block if b is true or jumping to the next else_if / else / end_if if b is false

### else()

Arguments: None\
Return type: void\
Return value: N/A\
Side effects: Continues the control flow from the previous if or else_if method, executing the subsquent block if b is true or jumping to to the next else_if / else / end_if if b is false

### end_if()

Arguments: None\
Return type: void\
Return value: N/A\
Side effects: Continues the control flow from the previous if, else_if or else method

### while()

Arguments: b: bool\
Return type N/A\
Return value: N/A\
Side effects: Begins the while control flow, executing the subsequent block if b is true or jumping to end_while if b is false

### end_while()

Arguments: None\
Return type: void\
Return value: N/A\
Side effects: Continues the control flow from the previous while method

## Input / Output

### print_string()

Arguments: s: str\
Return type: void\
Return value: N/A\
Side effects: Renders a string to standard out

### read_string()

Arguments: slot_num: int\
Return type: void\
Return value: N/A\
Side effects: Reads a string from standard in into string slot slot_num
