# Matched Proximity
Takes two lists of indices and matches each one from list 1 to the closest index in list 2 and calculates their distances.

Example:
Text =       "War and peace, peace and war. War, War, War. Give Peace a chance, we all want peace."
Indices =     0    1    2      3    4   5    6    7    8    9    10   11  12    13  14  15   16

list war = [0,5,6,7,8]
list peace = [2,3,10,16]
returns [[0,2,2],[5,3,2],[6,10,4],[7,16,9]]
