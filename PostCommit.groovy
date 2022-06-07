package at.allianz.mergebot

import groovy.json.JsonSlurper

String path=args[0]
def input = new JsonSlurper().parse(new File(path), "UTF-8")
return process(input)


int process(def input){
	def baseUrl
	int result=0
	try{
		if(!input.reviewerList.isEmpty()){
			String reviewer = input.reviewerList.get(0)
			String pullRequestUrl = input.pullRequestUrl
			//TODO create any post actions on pull requests
		}
	}catch(Exception e){
		//system out is the output the MergeBot receives - therefore it is ok - Exception is written into log-File of MergeBot
		println (e.getMessage() + "\n" + e.getStackTrace())
	}
	return result
}
