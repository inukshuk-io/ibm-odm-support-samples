# README

## env
* IBM ODM 8.10.3 (ODM Dev Rule Designer  + Docker Decision server) 
 
## To reproduce the problem
* import the github repo : https://github.com/inukshuk-io/ibm_odm_samples
* ex for the date : 04 Jan 2020
* in Standard Java  (ex Designer unit test)
     * run the launcher in **datebug-rules** called **test-datebug.launch**
	 * change the date in launcher init to have different dates
	 * for 04 Jan 2020 the output should be : **message =]2 jan 2020 to 4 jan 2020]**
* in Decision Server
     * deploy **datebug-rules** in a decision server in docker
	 * go in the HTDS test tab / JSON
	 * try the follwowing JSON :
	      * ```  { "__DecisionID__": "string", "claim": { "date": "2020-01-04"} } ```	 
	 * the output json should contains : **"message": "]4 jan 2020 to 5 jan 2020]"**


## Problem 
* see decision table : **datebug-rules\rules\check-between\betweenDates.dta**
* The behavior of conditions in dates in decision tables is not the same in standard Java (ex in unit tests) and in Decision server 


## Workaround 
* NONE yet
