This is not a Project, is just for Test some IA tools for development of TDD

command to run Mutations Test - mvn org.pitest:pitest-maven:mutationCoverage

command to run Evosuite - mvn -DmemoryInMB=2000 -Dcores=2 evosuite:generate evosuite:export test

Note: This last command is responsable to do a automatically TDD on your target class. 


