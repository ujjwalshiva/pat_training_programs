class student:
  def __init__(self):
    self.arr = []
  def add_ele(self,value):
    self.arr.append(value)

s = student()
s.add_ele(1)
s.add_ele(2)
s.add_ele(3)
s.print_array()  
# Output: [1, 2, 3]