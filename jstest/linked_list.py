# class linkedListNode():
#     def __init__(self,value,nextNode = None):
#         self.value = value
#         self.nextNode = None

# node1 = linkedListNode("3")
# node2 = linkedListNode("7")
# node3 = linkedListNode("10")

# node1.nextNode = node2 
# node2.nextNode = node3

# currentNode = node1
# while True:
#     print(currentNode.value, "->" ,end=" ")
#     if currentNode.nextNode is None:
#         print("None")
#         break
#     currentNode = currentNode.nextNode
        
# class Person:
#     def __init__(self, a) -> None:
#         self._a = a 
#         # self._b = b
#     def returnSum(self) -> int:
#         sum = self._a + self._b
#         return sum


# a = Person(input("Person._a is: "))
# b = Person(input(": "))
# sum = Person().returnSum

# print(sum)



# Person().returnTrue()


#---------------------------------------------- call Class Function
class Cat:
    def __init__(self, number, number1):
        self._number = number
        self._number1 = number1
    def returnSum(self) -> int:
        sum = self._number + self._number1
        return sum
cat = Cat(1,2)
funCat = Cat(5151,12132)
print(cat.returnSum())
print(funCat.returnSum())



# for i in range(1,7):
#     print("i is: "+ str(i))
#     for j in range(1,i+1):
#         print("    j is: "+ str(j))

