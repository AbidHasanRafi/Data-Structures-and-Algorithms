# bool: Boolean value
boolean_value = True
print(f"Boolean value: {boolean_value} (type: {type(boolean_value)})")

# int: integer (arbitrary magnitude)
integer_value = 1045
print(f"Integer value: {integer_value} (type: {type(integer_value)})")

# float: floating-point number
float_value = 3.934
print(f"Float value: {float_value} (type: {type(float_value)})")

# list: mutable sequence of objects
list_value = [1, 2, 3, 'a', 'b', 'c']
list_value.append(4)  # Modifying the list
print(f"List value: {list_value} (type: {type(list_value)})")

# tuple: immutable sequence of objects
tuple_value = (1, 2, 3, 'a', 'b', 'c')
print(f"Tuple value: {tuple_value} (type: {type(tuple_value)})")

# str: character string
string_value = "Hello, World!"
print(f"String value: {string_value} (type: {type(string_value)})")

# set: unordered set of distinct objects
set_value = {1, 2, 3, 'a', 'b', 'c'}
set_value.add('d')  # Modifying the set
print(f"Set value: {set_value} (type: {type(set_value)})")

# frozenset: immutable form of set class
frozenset_value = frozenset([1, 2, 3, 'a', 'b', 'c'])
print(f"Frozenset value: {frozenset_value} (type: {type(frozenset_value)})")

# dict: associative mapping (aka dictionary)
dict_value = {'key1': 'value1', 'key2': 'value2'}
dict_value['key3'] = 'value3'  # Modifying the dictionary
print(f"Dict value: {dict_value} (type: {type(dict_value)})")