# foobar
feedback a problem to intellij idea

Reproduce the problem
- add libs to `Dependencies` of this project
- run Main.main and got the `NoSuchMethodError`
- Go to see source code of `SkinServiceImpl` you'll find all is ok but I hope intellij idea could hint `Cannot resolve method booleanValue()` or other compile error
- And in this case if see decompiled code of `SkinServiceImpl` （Source code recreated from a .class file by IntelliJ IDEA）， the reson is more clear. So how to change to see decompiled source code even have dowloaded maven source code?

Maven dependency:tree

foobar
- foo
  - bar 1.0 Booelan isDefault
  
- bar 2.0 boolean isDefault 
  
