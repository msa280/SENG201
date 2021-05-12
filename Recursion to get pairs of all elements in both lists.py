def all_pairs(list1, list2, index1=0, index2=0, new=None):
    """Pairing using recursion."""
    if new == None:
        new = []
    if index1 < len(list1):
        if index2 < len(list2):   
            value = (list1[index1], list2[index2])
            new.append(value)
            index2 += 1
            return all_pairs(list1, list2, index1, index2, new)
        else: 
            index1 += 1
            index2 = 0
            return all_pairs(list1, list2, index1, index2, new) 
        
    return new
        
        
print(all_pairs([1, 2], [10, 20, 30]))


         
        
    