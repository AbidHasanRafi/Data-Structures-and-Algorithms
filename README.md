# Data Structures and Algorithms (ডেটা স্ট্রাকচার এবং অ্যালগরিদম)

বাংলায় সহজবোধ্যভাবে ডেটা স্ট্রাকচার এবং অ্যালগরিদমের টপিকগুলোর একটি সম্পূর্ণ গাইডলাইন প্রোভাইড করা হচ্ছে। এই আলোচনার কন্টেন্টগুলো `Michael T. Goodrich`, `Roberto Tamassia` ও `Michael H. Goldwasser` অথরদের লিখিত `Data Structures and Algorithms in Python` এবং `Data Structures and Algorithms in Java™` বইগুলোর উপর ভিত্তি করে তৈরী করা হয়েছে। আলোচনার প্রত্যেকটি সেকশনে পাইথন এবং জাভা উভয় প্রোগ্রামিং ল্যাঙুয়েজের রেফারেন্স ব্যবহার করা হবে। 

## Contents

1. [Primer](#primer)
2. [Object Oriented Programming Design](#object-oriented-programming-design)
3. [Fundamental Data Structures](#fundamental-data-structures)
4. [Algorithm Analysis](#algorithm-analysis)
5. [Recursion](#recursion)
6. [Stacks, Queues, and Deques](#stacks-queues-and-deques)
7. [Array Sequences, List and Iterator](#array-sequences-list-and-iterator)
8. [Trees](#trees)
9. [Priority Queues](#priority-queues)
10. [Maps, Hash Tables, and Skip Lists](#maps-hash-tables-and-skip-lists)
11. [Search Trees](#search-trees)
12. [Sorting and Selection](#sorting-and-selection)
13. [Text Processing](#text-processing)
14. [Graph Algorithms](#graph-algorithms)
15. [Memory Management and B-Trees](#memory-management-and-b-trees)


# Primer

`Primer` সেকশনে পাইথন এবং জাভার মৌলিক বিষয়গুলির একটি সংক্ষিপ্ত আলোচনা করা হয়েছে। আলোচনার প্রত্যেকটি অংশে উভয় ল্যাঙ্গুয়েজের প্রাথমিক বিষয়গুলো উদাহরণসহ বিস্তারিত আলোচনা করা হয়েছে।

### Table of Contents
1. [Getting Started](#getting-started)
   - [Python Overview](#python-overview)
   - [Java Overview](#java-overview)
2. [The Interpreter and Compiler](#the-interpreter-and-compiler)
   - [The Python Interpreter](#the-python-interpreter)
   - [The Java Compiler](#the-java-compiler)
3. [First Program](#first-program)
   - [Preview of a Python Program](#preview-of-a-python-program)
   - [Writing a Java Program](#writing-a-java-program)
4. [Objects and Classes](#objects-and-classes)
   - [Python Objects](#python-objects)
   - [Java Objects](#java-objects)
   - [Creating and Using Objects in Python](#creating-and-using-objects-in-python)
   - [Creating and Using Objects in Java](#creating-and-using-objects-in-java)
   - [Defining a Class in Python](#defining-a-class-in-python)
   - [Defining a Class in Java](#defining-a-class-in-java)
5. [Basic Types](#basic-types)
   - [Python's Built-In Classes](#pythons-built-in-classes)
   - [Java Base Types](#java-base-types)
6. [Expressions and Operators](#expressions-and-operators)
   - [Python Expressions](#python-expressions)
   - [Java Expressions](#java-expressions)
   - [Compound Expressions and Operator Precedence in Python](#compound-expressions-and-operator-precedence-in-python)
   - [Literals and Operators in Java](#literals-and-operators-in-java)
7. [Control Flow](#control-flow)
   - [Conditionals in Python](#conditionals-in-python)
   - [Conditionals in Java](#conditionals-in-java)
   - [Loops in Python](#loops-in-python)
   - [Loops in Java](#loops-in-java)
8. [Functions and Methods](#functions-and-methods)
   - [Functions in Python](#functions-in-python)
   - [Methods in Java](#methods-in-java)
   - [Python’s Built-In Functions](#pythons-built-in-functions)
   - [Java Methods](#java-methods)
9. [Input and Output](#input-and-output)
   - [Simple Input and Output in Python](#simple-input-and-output-in-python)
   - [Simple Input and Output in Java](#simple-input-and-output-in-java)
   - [File Handling in Python](#file-handling-in-python)
   - [File Handling in Java](#file-handling-in-java)
10. [Exception Handling](#exception-handling)
    - [Raising and Catching Exceptions in Python](#raising-and-catching-exceptions-in-python)
    - [Raising and Catching Exceptions in Java](#raising-and-catching-exceptions-in-java)
11. [Iterators and Generators](#iterators-and-generators)
    - [Python Iterators and Generators](#python-iterators-and-generators)
    - [Java Iterators](#java-iterators)
12. [Additional Conveniences](#additional-conveniences)
    - [Conditional Expressions in Python](#conditional-expressions-in-python)
    - [Comprehension Syntax in Python](#comprehension-syntax-in-python)
    - [Packing and Unpacking in Python](#packing-and-unpacking-in-python)
    - [Conveniences in Java](#conveniences-in-java)
13. [Scopes and Namespaces](#scopes-and-namespaces)
    - [Python Scopes and Namespaces](#python-scopes-and-namespaces)
    - [Java Scopes and Namespaces](#java-scopes-and-namespaces)
14. [Modules and Packages](#modules-and-packages)
    - [Python Modules and Import Statement](#python-modules-and-import-statement)
    - [Java Packages and Imports](#java-packages-and-imports)
15. [Software Development](#software-development)
    - [Design Principles](#design-principles)
    - [Pseudocode](#pseudocode)
    - [Coding Best Practices](#coding-best-practices)
    - [Documentation and Style](#documentation-and-style)
    - [Testing and Debugging](#testing-and-debugging)

## Getting Started
ডেটা স্ট্রাকচার এবং অ্যালগরিদম সম্পর্কে জানতে হলে আমাদের প্রথমে কম্পিউটারকে বিস্তারিত নির্দেশনা দেয়ার সম্পর্কে জানতে হবে। নির্দেশনা দেয়া বহুল ব্যবহৃত চমৎকার একটি পদ্ধতি হচ্ছে হাই-লেভেল কম্পিউটার ল্যাঙ্গুয়েজ ব্যবহার করা, যেমনঃ `পাইথন`, `জাভা` ইত্যাদি। এই সেকশনে আমরা জাভা এবং পাইথন প্রোগ্রামিং ল্যাঙ্গুয়েজের একটি সংক্ষিপ্ত আলোচনা করবো যাতে আমরা সামনের `অবজেক্ট অরিয়েন্টেড ডিজাইন প্রিন্সিপাল` সেকশনে আলোচনা অব্যহত রাখতে পারি।

### Python Overview
পাইথন একটি ডাইন্যামিক্যালি টাইপ করা উচ্চস্তরের ইন্টারপ্রেটেড প্রোগ্রামিং ল্যাঙ্গুয়েজ। সহজবোধ্য, পাঠযোগ্য এবং বিস্তর উন্মুক্ত স্ট্যান্ডার্ড লাইব্রেরি থাকার জন্য এটি প্রোগ্রামারদের মাঝে অনেক জনপ্রিয় একটি টুল। এটি ১৯৯১ সালে `গিডো ভান রসম` প্রথম প্রকাশ করেন। এর দ্বিতীয় মেজর সংস্করণ `পাইথন ২` প্রকাশ করা হয় ২০০০ সালে, এবং তৃতীয় মেজর সংস্করণ `পাইথন ৩` প্রকাশ করা হয় ২০০৮ সালে। সংযুক্ত সকল আলোচ্য সেকশনের পাইথন অংশগুলোতে আমরা `পাইথন ৩` এর উপর ভিত্তি করে আলোচনা করবো। পাইথনের লেটেস্ট ভার্সনটি [www.python.org](www.python.org) লিংক থেকে বিনামূল্যে ডাউনলোড এবং ব্যবহার করা যাবে, সংযুক্ত লিংকটিতে পাইথনের লেটেস্ট ডকুমেন্টেশন এবং টিউটোরিয়াল দেয়া আছে। 

### Java Overview
জাভা একটি স্ট্যাটিক্যালি টাইপ করা উচ্চস্তরের কম্পাইলড প্রোগ্রামিং ল্যাঙ্গুয়েজ। নব্বই-দশকের দিকে `সান মাইক্রোসিস্টেম` জাভা ডিজাইন করে এবং এটি অতি দ্রুত বিশ্বের জনপ্রিয় একটি প্রোগ্রামিং ল্যাঙ্গুয়েজে পরিণত হয়। বহনযোগ্যতা বা পোর্টেবিলিটি, সিকিউরিটি, এবং অবজেক্ট ওরিয়েন্টেড প্যারাডাইম ও ওয়েব প্রোগ্রামিং এর প্রতি একটি পরিপূর্ণ সাপোর্টের কারণে জাভা অনেক জনপ্রিয়। `জেমস গসলিং`-কে জাভা প্রোগ্রামিং ল্যাঙ্গুয়েজের জনক বলা হয়। ১৯৯১ সালে জেমস গসলিং জাভা ল্যাঙ্গুয়েজ প্রোজেক্ট শুরু করেন এবং ১৯৯৫ সালে সান মাইক্রোসিস্টেমস `জাভা-১.০` প্রকাশ করে। তাদের মূলনীতি ছিল "Write Once, Run Anywhere বা WORA"।

## The Interpreter and Compiler
সাধারণত, প্রোগ্রামাররা হাই লেভেল ল্যাংগুয়েজে কোড লিখে থাকে যা কম্পিউটার এক্সিকিউট করতে পারে না। কম্পিউটার শুধু ০ এবং ১ দ্বারা বাইনারি সিস্টেমে তৈরী মেশিন ল্যাঙ্গুয়েজ বুঝতে পারে যা প্রোগ্রামারদের পক্ষে লেখা দূর্বোধ্য। এজন্য উচ্চ-স্তরের প্রোগ্রামিং ল্যাঙ্গুয়েজকে মেশিন ল্যাঙুয়েজে রুপান্তর করতে ইন্টারপ্রেটার এবং কম্পাইলারের মতো ট্রান্সলেটর সিস্টেম ব্যবহার করা হয়। ইন্টারপ্রেটার এবং কম্পাইলার উভয়ই একটি অনুবাদ প্রক্রিয়ার মাধ্যমে সোর্স কোডকে (উচ্চ-স্তরের প্রোগ্রামিং ভাষা) মেশিন-লেভেলের ভাষায় রূপান্তরিত করে যাতে কম্পিউটার সেগুলো বুঝতে পারে।

### The Python Interpreter
পাইথন ইন্টারপ্রেটার-এর মাধ্যমে পাইথন কোড এক্সিকিউট হয়। ইন্টারপ্রেটার কম্পিউটার প্রোগ্রামের প্রতিটি স্টেটমেন্ট লাইনকে এক এক করে মেশিন ভাষায় রূপান্তর করে। এর ফলে প্রােগ্রামে ভুল সংশােধন করা এবং সহজেই অল্প পরিশ্রমে কোডে পরিবর্তন বা পরিবর্ধন করা যায়। এখানে প্রােগ্রামটি আকারে ছােট হয়ে থাকে সুতরাং কম্পিউটারের মেইন মেমােরিতে প্রসেস করতে কম জায়গার প্রয়ােজন হয়। গাঠনিক বৈশিষ্ট্যের জন্য এটি স্ক্রিপ্টিং এবং এপ্লিকেশন ডেভেলপমেন্টে বহুলভাবে ব্যবহৃত হয়।

### The Java Compiler
জাভা কম্পাইলার প্রোগ্রামারের দ্বারা তৈরীকৃত ফাইলকে কম্পাইল করে প্ল্যাটফর্ম ইন্ডিপেন্ডেন্ট জাভা ফাইলে রুপান্তর করে। কম্পাইল করার পর জাভা প্রোগ্রাম বাইটকোডে রুপান্তরিত হয় যা উইন্ডোজ, ম্যাক কিংবা লিনাক্স যেকোনো প্ল্যাটফর্মে জাভা ভার্চুয়াল মেশিন (JVM)-এর মাধ্যমে এক্সিকিউট করা যায়। এজন্য জাভা ল্যাঙ্গুয়েজকে প্ল্যাটফর্ম ইন্ডিপেন্ডেন্ট বলা হয়ে থাকে। কম্পাইলাররা ডেভেলপমেন্ট প্রক্রিয়ায় গুরুত্বপূর্ণ ভূমিকা পালন করে এবং কোড এক্সিকিউটের আগে সিন্ট্যাক্সের ত্রুটি শণাক্ত করতে সাহায্য করে ফলে সময় কম লাগে এবং সহজে প্রোগ্রাম ক্র্যাশ হয়না।

## First Program
স্পেসিফিক ল্যাঙ্গুয়েজের নির্দিষ্ট সিন্ট্যাক্স ব্যবহার কম্পিউটার প্রোগ্রাম লেখা হয়। অধিকাংশ প্রোগ্রামার জীবনে প্রথম "Hello, World!" প্রোগ্রামটি দিয়ে কোড শেখা শুরু করে। এই সিন্ট্যাক্সগুলো ল্যাঙ্গুয়েজভেদে ভিন্ন আকৃতির হয়ে থাকে।

### Preview of a Python Program
"Hello, World!" প্রিন্ট করে এমন একটি সহজ পাইথন প্রোগ্রামঃ
```python
print("Hello, World!")
```
এখানে `print()` একটি পাইথন ফাংশন যার কাজ হলো প্রিন্ট করে দেখানো। 

### Writing a Java Program
"Hello, World!" প্রিন্ট করে এমন একটি জাভা প্রোগ্রামঃ
```java
public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
```
জাভা প্রোগ্রামের প্রাথমিক আকৃতি কিছুটা জটিল মনে হলেও ব্যবহারের সাথে সাথে এটি অনেক সহজ এবং ইউজারফ্রেন্ডলি হয়ে যায়। এখানে `public class Hello` অংশে প্রথমে একটি ক্লাস (প্রদত্ত উদাহরণে `Hello`) ডিফাইন করা হয় যার মাধ্যমে প্রত্যেকটি জাভা প্রোগ্রাম শুরু হয়। `public static void main(String[] args)` অংশে main মেথড ডিক্লেয়ার করা হয় যা সম্পূর্ণ প্রোগ্রামের এন্ট্রি পয়েন্ট হিসেবে কাজ করে। অতঃপর `System.out.println()` স্টেটমেন্টের মাধ্যমে আমাদের কাঙ্খিত অংশ (প্রদত্ত উদাহরণে "Hello, World!") প্রিন্ট করা হয়।