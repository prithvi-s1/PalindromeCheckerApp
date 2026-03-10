Define Interface: Create a PalindromeStrategy with a single method isValid(String input).

Implement Concrete Strategies:

StackStrategy: Uses the LIFO approach.

DequeStrategy: Uses the front-to-back comparison approach.

Context Class: Create a PalindromeValidator that holds a reference to a strategy.

Runtime Injection: The user or system chooses which "brain" (strategy) to use at the moment of execution.