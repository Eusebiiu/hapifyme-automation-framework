# HapifyMe Automation Framework

Acest proiect reprezintă framework-ul de testare automatizată pentru platforma [HapifyMe](https://test.hapifyme.com), realizat ca proiect final pentru cursul de testare.

## 🚀 Tehnologii Utilizate
* **Limbaj:** Java
* **Build Tool:** Maven
* **Testare API:** RestAssured
* **Testare UI:** Selenium
* **Reporting:** Allure Reports
* **CI/CD:** GitHub Actions

---

## 🛠️ Instrucțiuni de Rulare Locală

Pentru a rula testele pe mașina locală, urmează pașii de mai jos:

1. **Clonarea proiectului:**
   ```bash
   git clone https://github.com/Eusebiiu/hapifyme-automation-framework.git
   cd hapifyme-automation-framework
2.Executarea testelor: Rulează toate testele folosind Maven: </br>
  mvn clean test</br>
3.Vizualizarea raportului Allure: După finalizarea testelor, rulează comanda pentru a porni serverul local:</br>
 mvn allure:serve</br>
🔄 Integrare Continuă (CI)</br>
Proiectul utilizează un workflow de GitHub Actions definit în .github/workflows pentru execuția automată a testelor la fiecare push.</br>

Status Pipeline:</br><img width="1644" height="813" alt="image" src="https://github.com/user-attachments/assets/3a44dd50-af43-42b5-bebd-10766947ffcf" />
