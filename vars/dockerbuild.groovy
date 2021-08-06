def call(String project) {



        
  sh 'docker build . aadi10894/my-app:$Docker_tag'
		   withCredentials([string(credentialsId: 'docker_password', variable: 'docker_password')]) {
				    
				  sh 'docker login -u aadi10894 -p $docker_password'
				  sh 'docker push aadi10894/my-app :$Docker_tag'
			}
}
