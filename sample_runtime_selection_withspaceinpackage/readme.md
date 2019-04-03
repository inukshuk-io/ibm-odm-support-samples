# README


## env
* IBM ODM 8.10.0
 
## To reproduce the problem
* import the github repo
* run the launcher


## Problem 
* in a ruleflow runtime selection that uses the package name, packages with space are not selected when they match the selection


## Workaround 
* create a b2X fonction that corrects wrong package names using internal IBM classes : IlrNameUtil.getBusinessIdentifier(name)
      * see bom_utils class
* wrap the string of the package name in the sentences with this fonction
       *  ex : the package name of 'the rule' ===> the business name of the package name of 'the rule'
