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

`Primer` সেকশনে পাইথন এবং জাভার মৌলিক বিষয়গুলির একটি সংক্ষিপ্ত আলোচনা করা হয়েছে। আলোচনার প্রত্যেকটি অংশে উভয় ল্যাঙ্গুয়েজের প্রাথমিক বিষয়গুলো উদাহরণসহ বিস্তারিত আলোচনা করা হবে।

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
   - [Defining a Class in Python](#defining-a-class-in-python)
   - [Defining a Class in Java](#defining-a-class-in-java)
   - [Creating and Using Objects in Python](#creating-and-using-objects-in-python)
   - [Creating and Using Objects in Java](#creating-and-using-objects-in-java)
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

ডেটা স্ট্রাকচার এবং অ্যালগরিদম সম্পর্কে জানতে হলে আমাদের প্রথমে কম্পিউটারকে বিস্তারিত নির্দেশনা দেয়ার সম্পর্কে জানতে হবে। নির্দেশনা দেয়ার বহুল ব্যবহৃত চমৎকার একটি পদ্ধতি হচ্ছে হাই-লেভেল কম্পিউটার ল্যাঙ্গুয়েজ ব্যবহার করা, যেমনঃ `পাইথন`, `জাভা` ইত্যাদি। এই সেকশনে আমরা জাভা এবং পাইথন প্রোগ্রামিং ল্যাঙ্গুয়েজের একটি সংক্ষিপ্ত আলোচনা করবো যাতে সামনের `অবজেক্ট অরিয়েন্টেড ডিজাইন প্রিন্সিপাল` সেকশনে আমরা আলোচনা অব্যহত রাখতে পারি।

### Python Overview

পাইথন একটি ডাইন্যামিক্যালি টাইপ করা উচ্চস্তরের ইন্টারপ্রেটেড প্রোগ্রামিং ল্যাঙ্গুয়েজ। সহজবোধ্য, পাঠযোগ্য এবং বিস্তর উন্মুক্ত স্ট্যান্ডার্ড লাইব্রেরি থাকার জন্য এটি প্রোগ্রামারদের মাঝে অনেক জনপ্রিয় একটি টুল। এটি ১৯৯১ সালে `গিডো ভান রসম` প্রথম প্রকাশ করেন। এর দ্বিতীয় মেজর সংস্করণ `পাইথন ২` প্রকাশ করা হয় ২০০০ সালে, এবং তৃতীয় মেজর সংস্করণ `পাইথন ৩` প্রকাশ করা হয় ২০০৮ সালে। সংযুক্ত সকল আলোচ্য সেকশনের পাইথন অংশগুলোতে আমরা `পাইথন ৩` এর উপর ভিত্তি করে আলোচনা করবো। পাইথনের লেটেস্ট ভার্সন [python.org](https://www.python.org/) লিংক থেকে বিনামূল্যে ডাউনলোড এবং ব্যবহার করা যাবে, সংযুক্ত লিংকটিতে পাইথনের লেটেস্ট ডকুমেন্টেশন এবং টিউটোরিয়াল দেয়া আছে।

### Java Overview

জাভা একটি স্ট্যাটিক্যালি টাইপ করা উচ্চস্তরের কম্পাইলড প্রোগ্রামিং ল্যাঙ্গুয়েজ। নব্বই-দশকের দিকে `সান মাইক্রোসিস্টেম` জাভা ডিজাইন করে এবং এটি অতি দ্রুত বিশ্বের জনপ্রিয় একটি প্রোগ্রামিং ল্যাঙ্গুয়েজে পরিণত হয়। বহনযোগ্যতা বা পোর্টেবিলিটি, সিকিউরিটি, এবং অবজেক্ট ওরিয়েন্টেড প্যারাডাইম ও ওয়েব প্রোগ্রামিং এর প্রতি একটি পরিপূর্ণ সাপোর্টের কারণে জাভা অনেক জনপ্রিয়। `জেমস গসলিং`-কে জাভা প্রোগ্রামিং ল্যাঙ্গুয়েজের জনক বলা হয়। ১৯৯১ সালে জেমস গসলিং জাভা ল্যাঙ্গুয়েজ প্রোজেক্ট শুরু করেন এবং ১৯৯৫ সালে সান মাইক্রোসিস্টেমস `জাভা-১.০` প্রকাশ করে। তাদের মূলনীতি ছিল "Write Once, Run Anywhere বা WORA"। লোকাল মেশিনে জাভা এনভায়ারমেন্ট সেট করার জন্য [oracle.com/java/technologies/downloads](https://www.oracle.com/java/technologies/downloads/) লিংক থেকে `JDK Development Kit` ডাউনলোড ও ইন্সটল করে নিতে হবে।

## The Interpreter and Compiler

সাধারণত, প্রোগ্রামাররা হাই লেভেল ল্যাংগুয়েজে কোড লিখে থাকে যা কম্পিউটার এক্সিকিউট করতে পারে না। কম্পিউটার শুধু ০ এবং ১ দ্বারা বাইনারি সিস্টেমে তৈরী মেশিন ল্যাঙ্গুয়েজ বুঝতে পারে যা প্রোগ্রামারদের পক্ষে লেখা দূর্বোধ্য। এজন্য উচ্চ-স্তরের প্রোগ্রামিং ল্যাঙ্গুয়েজকে মেশিন ল্যাঙুয়েজে রুপান্তর করতে ইন্টারপ্রেটার এবং কম্পাইলারের মতো ট্রান্সলেটর সিস্টেম ব্যবহার করা হয়। ইন্টারপ্রেটার এবং কম্পাইলার উভয়ই একটি অনুবাদ প্রক্রিয়ার মাধ্যমে সোর্স কোডকে (উচ্চ-স্তরের প্রোগ্রামিং ভাষা) মেশিন-লেভেলের ভাষায় রূপান্তরিত করে যাতে কম্পিউটার সেগুলো বুঝতে পারে।

### The Python Interpreter

পাইথন ইন্টারপ্রেটার-এর মাধ্যমে পাইথন কোড এক্সিকিউট হয়। ইন্টারপ্রেটার কম্পিউটার প্রোগ্রামের প্রতিটি স্টেটমেন্ট লাইনকে এক এক করে মেশিন ভাষায় রূপান্তর করে। এর ফলে প্রােগ্রামে ভুল সংশােধন করা এবং সহজেই অল্প পরিশ্রমে কোডে পরিবর্তন বা পরিবর্ধন করা যায়। এখানে প্রােগ্রামটি আকারে ছােট হয়ে থাকে সুতরাং কম্পিউটারের মেইন মেমােরিতে প্রসেস করতে কম জায়গার প্রয়ােজন হয়। গাঠনিক বৈশিষ্ট্যের জন্য এটি স্ক্রিপ্টিং এবং এপ্লিকেশন ডেভেলপমেন্টে বহুলভাবে ব্যবহৃত হয়।

### The Java Compiler

জাভা কম্পাইলার প্রোগ্রামারের দ্বারা তৈরীকৃত ফাইলকে কম্পাইল করে প্ল্যাটফর্ম ইন্ডিপেন্ডেন্ট জাভা ফাইলে রুপান্তর করে। কম্পাইল করার পর জাভা প্রোগ্রাম বাইটকোডে রুপান্তরিত হয় যা উইন্ডোজ, ম্যাক কিংবা লিনাক্স যেকোনো প্ল্যাটফর্মে জাভা ভার্চুয়াল মেশিন (JVM)-এর মাধ্যমে এক্সিকিউট করা যায়। এজন্য জাভা ল্যাঙ্গুয়েজকে প্ল্যাটফর্ম ইন্ডিপেন্ডেন্ট বলা হয়ে থাকে। কম্পাইলাররা ডেভেলপমেন্ট প্রক্রিয়ায় গুরুত্বপূর্ণ ভূমিকা পালন করে এবং কোড এক্সিকিউটের আগে সিন্ট্যাক্সের ত্রুটি শণাক্ত করতে সাহায্য করে ফলে সময় কম লাগে এবং সহজে প্রোগ্রাম ক্র্যাশ হয়না।

## First Program

নির্দিষ্ট ল্যাঙ্গুয়েজের জন্য স্পেসিফিক সিন্ট্যাক্স ব্যবহার করে কম্পিউটার প্রোগ্রাম লেখা হয়। মজার বিষয় হলো যে অধিকাংশ প্রোগ্রামারই প্রথম "Hello, World!" কোড দিয়ে প্রোগ্রামিং শেখা শুরু করে। এই সিন্ট্যাক্সগুলো প্রোগ্রামিং ল্যাঙ্গুয়েজভেদে ভিন্ন স্ট্রাকচারের হয়ে থাকে।

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

জাভা প্রোগ্রামের প্রাথমিক আকৃতি কিছুটা জটিল মনে হলেও ব্যবহারের সাথে সাথে এটি অনেক সহজ এবং ইউজারফ্রেন্ডলি হয়ে যায়। এখানে `public class Hello` অংশে একটি ক্লাস (প্রদত্ত উদাহরণে `Hello`) ডিফাইন করা হয় যার মাধ্যমে প্রত্যেকটি জাভা প্রোগ্রাম শুরু হয়। উক্ত ক্লাসের ভিতরে `public static void main(String[] args)` অংশে main মেথড ডিক্লেয়ার করা হয় যা সম্পূর্ণ প্রোগ্রামের এন্ট্রি পয়েন্ট হিসেবে কাজ করে। অতঃপর `System.out.println()` স্টেটমেন্টের মাধ্যমে আমাদের কাঙ্খিত অংশ (প্রদত্ত উদাহরণে "Hello, World!") প্রিন্ট করা হয়।

## Objects and Classes

### Python Objects

পাইথনে সবচেয়ে গুরুত্বপূর্ণ অপারেটর হচ্ছে `=` এসাইনমেন্ট অপারেটর। যেমনঃ

```python
temperature = 98.6
```

এখানে `=` এর মাধ্যমে গণিতের "সমান" বোঝানো হচ্ছেনা, বরং বোঝানো হচ্ছে যে 98.6 দশমিক সংখ্যাটাকে temperature-এ এসাইন করা হয়েছে। temperature-কে এখানে `identifier` বা `name` বলা যেতে পারে। পাইথনে `identifier` কেস-সেনসিটিভ হয়ে থাকে অর্থাৎ আমরা যদি এখানে Temperature নামে কোনো `identifier` ব্যবহার করি, তাহলে সেটি temperature থেকে ভিন্ন হিসেবে গণ্য করা হবে। যেকোনো ইংরেজি লেটার, নিউমেরাল, এবং আন্ডারস্কোল ক্যারেক্টার (অথবা সাধারণ ইউনিকোড ক্যারেক্টার) এর সংমিশ্রণে `identifier` লেখা যায় তবে মনে রাখতে হবে এটি কখনও নাম্বার দিয়ে শুরু হতে পারবেনা (যেমনঃ 9lives একটি ইনভ্যালিড `identifier`) এবং কিছু রিজার্ভড শব্দ আছে যেগুলো আমরা পাইথনে `identifier` হিসেবে ব্যবহার করতে পারবো না। নিচের টেবিলে রিজার্ভড শব্দগুলো দেখানো হলোঃ

<table border="1" cellspacing="10" cellpadding="10" style="width:100%; text-align:center;";>
  <tr>
    <th colspan="4" style="text-align:center;">Reserved Words</th>
  </tr>
  <tr>
    <td>False</td>
    <td>await</td>
    <td>else</td>
    <td>import</td>
  </tr>
  <tr>
    <td>None</td>
    <td>break</td>
    <td>except</td>
    <td>in</td>
  </tr>
  <tr>
    <td>True</td>
    <td>class</td>
    <td>finally</td>
    <td>is</td>
  </tr>
  <tr>
    <td>and</td>
    <td>continue</td>
    <td>for</td>
    <td>lambda</td>
  </tr>
  <tr>
    <td>as</td>
    <td>def</td>
    <td>from</td>
    <td>nonlocal</td>
  </tr>
  <tr>
    <td>assert</td>
    <td>del</td>
    <td>global</td>
    <td>not</td>
  </tr>
  <tr>
    <td>async</td>
    <td>elif</td>
    <td>if</td>
    <td>or</td>
  </tr>
  <tr>
    <td>pass</td>
    <td>raise</td>
    <td>return</td>
    <td>try</td>
  </tr>
  <tr>
    <td>while</td>
    <td>with</td>
    <td>yield</td>
    <td></td>
  </tr>
</table>

কম্পিউটার প্রোগ্রামিং এর সাথে কাজ করার অভিজ্ঞতা থাকলে লক্ষ্য করা যাবে যে পাইথনে `identifier` এর সিন্যাক্স অনেকটা `Java` বা `C++` `variable` এর মতো। কিন্ত পাইথন এগুলোর মতো স্ট্যাটিক্যালি টাইপড ল্যাঙ্গুয়েজ নয়, এটি ডাইন্যামিক্যালি টাইপড। অর্থাৎ, পাইথনে ডিক্লেয়ার করার সময় `identifier` এর কোনো টাইপ উল্লেখ করতে হয়না।

### Java Objects

জাভাতে Object হলো Class এর একটি instance, সকল জাভা Object এর ক্ষেত্রে এটি প্রযোজ্য। এটি অনেকটা Class এর blueprint এর মতো কাজ করে। জাভা ক্লাসের সবচেয়ে ক্রিটিক্যাল মেম্বার হলো Instance variables এবং Methods। জাভাতে কিছু Reserved Words আছে যেগুলো `class`, `method`, বা `variable`-এর নাম হিসেবে ব্যবহার করা যাবেনা।

<table border="1" cellspacing="10" cellpadding="10" style="width:100%; text-align:center;">
  <tr>
    <th colspan="4" style="text-align:center;">Reserved Words</th>
  </tr>
  <tr>
    <td>abstract</td>
    <td>continue</td>
    <td>for</td>
    <td>new</td>
  </tr>
  <tr>
    <td>assert</td>
    <td>default</td>
    <td>goto</td>
    <td>package</td>
  </tr>
  <tr>
    <td>boolean</td>
    <td>do</td>
    <td>if</td>
    <td>private</td>
  </tr>
  <tr>
    <td>break</td>
    <td>double</td>
    <td>implements</td>
    <td>protected</td>
  </tr>
  <tr>
    <td>byte</td>
    <td>else</td>
    <td>import</td>
    <td>public</td>
  </tr>
  <tr>
    <td>case</td>
    <td>enum</td>
    <td>instanceof</td>
    <td>return</td>
  </tr>
  <tr>
    <td>catch</td>
    <td>extends</td>
    <td>int</td>
    <td>short</td>
  </tr>
  <tr>
    <td>char</td>
    <td>final</td>
    <td>interface</td>
    <td>static</td>
  </tr>
  <tr>
    <td>class</td>
    <td>finally</td>
    <td>long</td>
    <td>strictfp</td>
  </tr>
  <tr>
    <td>const</td>
    <td>float</td>
    <td>native</td>
    <td>super</td>
  </tr>
  <tr>
    <td>continue</td>
    <td>for</td>
    <td>new</td>
    <td>switch</td>
  </tr>
  <tr>
    <td>void</td>
    <td>volatile</td>
    <td>while</td>
    <td>try</td>
  </tr>
  <tr>
    <td>throws</td>
    <td>this</td>
    <td>transient</td>
    <td>strictfp</td>
  </tr>
</table>

- **Instance variables**: এরা Object এর সাথে সম্পৃক্ত ডেটাকে রিপ্রেজেন্ট করে। এদের প্রত্যকের একটি নির্দিষ্ট টাইপ আছে, যা বেস টাইপ (যেমনঃ `int`, `float`, `double` ইত্যাদি) অথবা যেকোনো Class টাইপ (রেফারেন্স টাইপ) হতে পারে।

- **Methods**: এগুলো হচ্ছে কোড ব্লক যা নির্দিষ্ট কিছু কাজ সম্পাদন করে। জাভা object এর স্টেট এর উপর নির্ভর করে প্যারামিটারের ভ্যাল এক্সেপ্ট করে। যে Method'গুলো instance variable-কে পরিবর্তন ছাড়াই ইনফরমেশন রিটার্ন করতে পারে তাদের accessor method বলা হয়। যে Method-গুলো instance variables-কে মডিফাই করে তাদের update method বলা হয়।

একটি Counter জাভা class-এর মাধ্যমে কনসেপ্টগুলো দেখানো হলোঃ

```java
public class Counter {
    private int count; // a simple integer instance variable

    public Counter() { } // default constructor (count is 0)

    public Counter(int initial) { count = initial; } // an alternate constructor

    public int getCount() { return count; } // an accessor method

    public void increment() { count++; } // an update method

    public void increment(int delta) { count += delta; } // an update method

    public void reset() { count = 0; } // an update method
}
```

এখানে,

- **Instance Variable**: `count` (line 2)
- **Constructors**: Default (line 3) এবং parameter-এর সাথে (line 4)
- **Accessor Method**: `getCount` (line 5)
- **Update Methods**: `increment()` (line 6), `increment(int delta)` (line 7), এবং `reset()` (line 8)

উপরোক্ত আলোচনা থেকে ভয় পাওয়ার কিছু নেই, পরবর্তী সেকশনগুলোতে এগুলো সম্পর্কে বিস্তারিত আলোচনা করা হবে।

### Defining a Class in Python

ক্লাস হলো অবজেক্ট তৈরী করার একটি blueprint। এটি অবজেক্ট তৈরী করার জন্য একগুচ্ছ attributes (data) ও methods (functions) ডিফাইন করে দেয়। পাইথনে একটি ক্লাস ডিফাইন করার জন্য `class` কিওয়ার্ড ব্যবহার করে প্যারেথেসিস-সহ ক্লাসের নাম ও কোলন(`:`) দিতে হয়ঃ

```python
class ClassName:
    # Class attributes and methods go here
    pass
```

### Defining a Class in Java

জাভাতে ক্লাস হলো অবজেক্ট তৈরী করার blueprint। ক্লাস থেকে তৈরী অবজেক্টের কি কি properties (attributes) এবং behaviors (methods) থাকবে সেগুলো ডিফাইন করাই ক্লাসের কাজ। জাভায় ক্লাস ডিফাইন করার জন্য `class` কিওয়ার্ড ব্যবহার করে কার্লি ব্রেসসহ ক্লাসের নাম দিতে হয়। ক্লাসের মধ্যে attributes এবং methods-গুলো ডিফাইন করা হয়ঃ

```java
public class ClassName {
    // Class attributes and methods go here
}
```

### Creating and Using Objects in Python

একটি ক্লাস থেকে নতুন অবজেক্ট তৈরী করার প্রসেসকে `Instantiation` বলা হয়। অবজেক্ট তৈরী করার ক্ষেত্রে আমরা প্যারেন্থেসিস-সহ ক্লাসের নাম ব্যবহার করি যা দ্বারা `constructor` কলিং বুঝানো হয়। ধরা যাক, `Dog` নামে আমাদের একটি ক্লাস আছেঃ

```python
class Dog:
    def __init__(self, name, age):
        self.name = name
        self.age = age
```

এটি থেকে আমরা একটি অবজেক্ট (an instance of `Dog`) তৈরী করতে পারিঃ

```python
my_dog = Dog("Buddy", 3)
```

এখানে, `my_dog` হলো `Dog` ক্লাসের একটি অবজেক্ট যার name "Buddy" এবং age 3।

### Creating and Using Objects in Java

জাভাতে `class` থেকে `constructor` কলিং এর মাধ্যমে `object` তৈরী করার পদ্ধতিকে `Instantiation` বলে। অবজেক্ট তৈরী করার ক্ষেত্রে প্যারেন্থেসিস-সহ ক্লাসের নামের আগে `new` কিওয়ার্ড ব্যবহার করা হয়। মনে করি, `Dog` নামে আমাদের একটি জাভা ক্লাস আছেঃ

```java
public class Dog {
    String name;
    int age;

    // Constructor
    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
```

এটি থেকে আমরা একটি জাভা অবজেক্ট (an instance of `Dog`) তৈরী করতে পারিঃ

```java
public class Pet {
    public static void main(String[] args) {
        Dog myDog = new Dog("Buddy", 3);
    }
}
```

এখানে, `my_dog` হলো `Dog` ক্লাসের একটি অবজেক্ট যার name "Buddy" এবং age 3।
