# **Author : Igor Mihailiuc**

# Topic : *Behavioral design patterns*

## Objectives:
1. Study and understand the Behavioral Design Patterns.
2. As a continuation of the previous laboratory work, think about what communication between software entities might be involed in your system.
3. Create a new Project or add some additional functionalities using behavioral design patterns.

# Implementation
- For this laboratory work, I've implemented a example of creating and selling cars I've decided to implement ***Command pattern*** Here are the examples:

1. ***Command pattern*** :
The Command Design Pattern wraps a request in an object as command and pass it to a command invoker object. When invoker receives a request, it looks for the appropriate object which is capable of handling this request and passes the command to the corresponding object for execution. This allows clients to be parameterized with different requests.

```
public interface ActionListenerCommand {

    public void execute();
    
}
```
```
public class Invoker {

    private ActionListenerCommand construct, sell;

    public Invoker(ActionListenerCommand construct, ActionListenerCommand sell) {

        this.construct = construct;
        this.sell = sell;

    }

    public void checkConstruct() {

        construct.execute();

    }

    public void checkSell() {

        sell.execute();

    }
}
```

# Conclusion

In conclusion I want to say that this laboratory wokr made me capable of implementing some new important stuff like the behavioral design patterns, and that those help us write a cleaner and easier to understand code.