"""
File:    how_deep.py
Author:  Adam Owolabi
Date:    11/6/2023
Section: SECTION 17
E-mail:  aowolab1@umbc.edu
Description:
  Program to perform derangement( ways to permute letter in a diefferent position)
"""

import random
def how_deep(list_struct):
    """
    param: list_struct. a list with/without sublists that is used to decide depth of list
    """
    max = 0
    if list_struct == []:  #base case
        return 1
    if list_struct != []:
        for i in list_struct:       #forloop to check our given non empty list, check the sublists
            depth = how_deep(i) + 1  #recursive call. counter for the sublists 
            if depth > max:     #condition if sublists is deeper than outer list, outerlist is always. 
                max = depth     #if sublist i deeper, update max to be thhe deepest the sum of the sublists. Max is not renewed 
        return max
            

def make_list_structure(max_depth, p=.8):
   if max_depth and random.random() < p:
       new_list = []
       for i in range(5):
           sub_list = make_list_structure(max_depth - 1, p * .9)
           if sub_list is not None:
               new_list.append(sub_list)
       return new_list
   return None

if __name__ == '__main__':
    print(how_deep([[[], [], [], [[[]]]], []]))
    print(how_deep([]))
    print(how_deep([[], []]))
    print(how_deep([[[]], [], [[]], [[[]]]]))
    print(how_deep([[[[], [[]], [[[]]], [[[[]]]]]]]))
    print(how_deep([[[], []], [], [[], []]]))