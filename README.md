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
Return value: The value previously stored in slot_num

### set_bool()

Arguments: slot_num: int, value: bool\
Return type: void\
Return value: N/A\
Side effects: Stores value in slot slot_num

### is_bool_set()

Arguments: slot_num: int\
Return type: bool\
Return value: true if a boolean has been stored in slot slot_num, otherwise false

### get_int()

Arguments: slot_num: int\
Return type: int\
Return value: The value previously stored in slot_num

### set_int()

Arguments: slot_num: int, value: int\
Return type: N/A\
Return value: N/A\
Side effects: Stores value in slot slot_num

### is_int_set()

Arguments: slot_num: int\
Return type: bool\
Return value: true if an int has been stored in slot slot_num, otherwise false

### get_float()

Arguments: slot_num: int\
Return type: float\
Return value: The value previously stored in slot_num

### set_float()

Arguments: slot_num: int, value: float\
Return type: void\
Return value: N/A\
Side effects: Stores value in slot slot_num

### is_float_set()

Arguments: slot_num: int\
Return type: bool\
Return value: true if a float has been stored in slot slot_num, otherwise false

### get_char()

Arguments: slot_num: int\
Return type: char\
Return value: The value previously stored in slot_num

### set_char()

Arguments: slot_num: int, value: char\
Return type: void\
Return value: N/A\
Side effects: Stores value in slot slot_num

### is_char_set()

Arguments: slot_num: int\
Return type: bool\
Return value: true if a char has been stored in slot slot_num, otherwise false

### get_string()

Arguments: slot_num: int\
Return type: string\
Return value: The value previously stored in slot_num

### set_string()

Arguments: slot_num: int, value: string\
Return type: void\
Return value: N/A\
Side effects: Stores value in slot slot_num

### is_string_set()

Arguments: slot_num: int\
Return type: bool\
Return value: true if a string has been stored in slot slot_num, otherwise false

## Type conversion methods

### int_to_float

### int_to_string

### float_to_string

### char_to_int

### char_to_string

### str_is_int

### str_to_int

### str_is_float

### str_to_float

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
Retrun type: float\
Return value: a / b

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
Return type: N/A\
Return value: N/A\
Side effects: Begins the if control flow, executing the subsequent block if b is true or jumping to else_if / else / end_if if b is false

### else_if()

Arguments: b: bool\
Return type: N/A\
Return value: N/A\
Side effects: Continues the control flow from the previous if or else_if method, executing the subsequent block if b is true or jumping to the next else_if / else / end_if if b is false

### else()

Arguments: None\
Return type: N/A\
Return value: N/A\
Side effects: Continues the control flow from the previous if or else_if method, executing the subsquent block if b is true or jumping to to the next else_if / else / end_if if b is false

### end_if()

Arguments: None\
Return type: N/A\
Return value: N/A\
Side effects: Continues the control flow from the previous if, else_if or else method

### while()

Arguments: b: bool\
Return type N/A\
Return value: N/A\
Side effects: Begins the while control flow, executing the subsequent block if b is true or jumping to end_while if b is false

### end_while()

Arguments: None\
Return type: N/A\
Return value: N/A\
Side effects: Continues the control flow from the previous while method
