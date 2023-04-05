class student:
    name = "random name"
    age = 30
    def greeting(self, name):
        print("hello ", self.name)
    
ob = student()
print(ob.name)
ob.greeting('')

class contructor:
    def __init__(self):
        self.name = "charles"
        print("this is a constructor")
    def say_hello(self):
        print(self.name)
obj = contructor()
obj.say_hello()

obj1 = contructor("max")
obj2 = contructor("lewis")
obj3 = contructor("alonso")

obj1.say_hello()
obj2.say_hello()
obj3.say_hello()