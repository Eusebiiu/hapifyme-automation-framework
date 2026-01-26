HapifyMe Automation Framework
Acest proiect reprezintă framework-ul de testare automatizată pentru platforma HapifyMe, realizat ca proiect final pentru cursul de testare.

🚀 Tehnologii Utilizate
Limbaj: Java

Build Tool: Maven

Testare API: RestAssured

Testare UI: Selenium WebDriver

Reporting: Allure Reports

CI/CD: GitHub Actions

🛠️ Instrucțiuni de Rulare Locală
Pentru a rula testele pe mașina locală, urmează pașii de mai jos:

Clonarea proiectului:

Bash

git clone https://github.com/Eusebiiu/hapifyme-automation-framework.git
cd hapifyme-automation-framework
Executarea testelor: Rulează toate testele folosind Maven:

Bash

mvn clean test
Generarea raportului Allure: După finalizarea testelor, poți vizualiza rezultatele grafice cu:

Bash

mvn allure:serve
🔄 Integrare Continuă (CI)
Proiectul este integrat cu GitHub Actions. Pipeline-ul este configurat să ruleze automat la fiecare push pe branch-ul main.

Status Pipeline: <img width="1907" height="785" alt="image" src="https://github.com/user-attachments/assets/387a77fb-e65b-4be6-a6a6-0f88bb79f4e2" />
