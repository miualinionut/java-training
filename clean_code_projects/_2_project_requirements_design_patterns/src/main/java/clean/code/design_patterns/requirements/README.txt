1. Builder

I created a builder for Person class, which has only one required field: brand. The others are optional. The builder
allows you to set optional parameters after you created the Person-type object. It has an override for toString() method
which will print object's informations

2. Strategy

Update is a interface that has a method to show you a message when you check for updates on your phone. It also tell you
what operating system you are currently using. I created two classes: Android and iOS for this interface, depending on
the phone's type.
