```groovy
def myMethod(a, b) {
  if (a == null || b == null) {
    return null //This will cause a NullPointerException later if not handled
  }
  return a + b
}

println myMethod(5, null)
```