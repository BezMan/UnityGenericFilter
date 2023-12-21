- GenericFilter class holds a Filter interface, which is implemented by various classes that hold their unique filter logic. 
This allows us to filter a list according to various unrelated conditions and extend the filters list in a scaleable way.

- Multiple flavors, mockApi and realApi, both containing ArticlesApi.kt. 
ApiImplFactory is the custom DI factory which gets the data, according to our flavor of choice.     
