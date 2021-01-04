# Design Patterns lab part 1: Factory, Observer, Strategy

Design a mock application that receives data (step counts) and has components that process it.

The app components are loosely coupled and the architecture includes the following patterns:
   * Observer - when the DataRepository (the observable) has updates it notifies its observers (ConsoleLogger,
                Aggregator and ServerCommunicationController)
   * Strategy - the processing algorithms are implemented independently following a common interface and are
                interchangeable at runtime
   * Factory - for creating Strategy objects without specify the exact strategy subclass.

## Components

Feel free to extend the design with more strategies and observers or modify the names of the existing components to make
them more suggestive.

* MainApp - entry point for testing

* storage.DataRepository
    * handles the data
    * it is an observable, extending the java.util.Observable class
    * in a real-world scenario it would interact with a component to persist the data (e.g. in-memory caching, databases).

* ConsoleLogger, ServerCommunicationController, DataAggregator
    * observers for changes in data repository, implement java.util.Observer interface
    * ConsoleLogger prints the changes
    * ServerCommunicationController builds a ServerMessage and transmits it to a server (since this is a just a lab
    exercise, we just print the message sent to the server, we don't interact with any server)
    * DataAggregator applies a strategy on the received data and prints its result. It can receive the strategy in
    its constructor.

* StepCountStrategy
    * interface for data processing strategies
    * for simplicity the "algorithms" just compute the sum of steps
    * implementations:
        * BasicStepCountStrategy - sums up all the step data received so far
        * FilteredStepCountStrategy - sums up all the step data but filtering outliers with two conditions:
             * step count value should be a positive number
             * ignore values that are too big in a too short interval (more than 1000 steps in less than 1 minute)

* StepCountStrategyFactory
    * creates StepCountStrategy objects based on a string it receives as input. The available strings are defined in Utils.
