# android-app
Source code for MADMeetup android app

## Prerequisites
1. Android Studio Stable 3.0
2. Some time to exlpore the repo :smiley:

## Built using
1. Architecture Components by Google
2. Kotlin
3. Dagger 2.10
4. Firebase

## Usage
This is an initial setup of how things should look when developing android apps using the latest **stable** Architecture Components namely LiveData and ViewModel.

The code is simple to understand but do let us know if any questions by opening up an issue.

## Code organization
The repo consists of two modules namely **app** and **core**. The **app** module has the things related to UI(although there are no concreate layout files in code base :stuck_out_tongue_winking_eye:) and ViewModel.

The **core** module basically deals with fetching of the data either from local or remote. This can be replaced by your own implementations. Currently we are using Firebase (as an example) for storing and retrieving data.

## Feature Implementation
Each feature needs to be developed individually by creating a folder at the top level after the main package. Refer login folder for an example.

Just add the dagger component for your feature to **AppComponent**(src/main/kotlin/org/madmeetup/dagger/AppComponent) class.

## Warning
The google_services.json is stripped from the repo and you will have to create one by logining into firebase console. This is a temporary block as we need to discuss the future scope of this project.

## Todo
* Add Contributing.md
* Implement login feature as an example for community to follow
* Anything we can't think of now :grin:

## Pull requests are welcome :relieved:
Happy to have pull requests from the community members.


## License
    The MIT License (MIT)

    Copyright (c) 2017 MADMeetup

    Permission is hereby granted, free of charge, to any person obtaining a copy
    of this software and associated documentation files (the "Software"), to deal
    in the Software without restriction, including without limitation the rights
    to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
    copies of the Software, and to permit persons to whom the Software is
    furnished to do so, subject to the following conditions:

    The above copyright notice and this permission notice shall be included in all
    copies or substantial portions of the Software.

    THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
    IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
    FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
    AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
    LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
    OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
    SOFTWARE.



