```groovy
def myMethod(a, b) {
  if (a == null || b == null) {
    return 0 // Or handle it appropriately, perhaps throw an exception
  }
  return a + b
}

println myMethod(5, null) //Prints 5 instead of throwing an exception

def myMethod2(a = 0, b = 0) { //Providing default values
    return a+b
}
println myMethod2(5,null) //Prints 5 
```