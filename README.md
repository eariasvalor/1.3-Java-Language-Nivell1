# Exercici 1 - Classe Month, ArrayList i HashSet

📄 **Descripció - Enunciat de l'exercici**

Crea una classe anomenada Month amb un atribut name (que emmagatzemarà el nom del mes de l'any).
Afegeix 11 objectes Month (cadascun amb el seu atribut diferent) en un ArrayList, a excepció de l'objecte amb atribut "Agost".

Després, efectua la inserció en el lloc que correspon a aquest mes i demostra que l’ArrayList manté l'ordre correcte.

Converteix l’ArrayList de l’exercici anterior en un HashSet i assegura’t que no permet duplicats.

Recorre la llista amb un for i amb un iterador.

# Exercici 2 - Llistes i ListIterator

📄 **Descripció - Enunciat de l'exercici**

Crea i emplena un List<Integer>.

Crea un segon List<Integer> i insereix a la segona llista els elements de la primera en ordre invers.

Empra els objectes ListIterator per a llegir els elements de la primera llista i inserir-los en la segona.

# Exercici 3 - HashMap, fitxers i joc de capitals

📄 **Descripció - Enunciat de l'exercici**

Donat el fitxer countries.txt (vegeu l'apartat Recursos) que conté parelles de país i capital, el programa ha de:

1. **Llegir** el fitxer i **guardar** les dades en un `HashMap<String, String>` on la **clau** és el país i el **valor** és la capital.  
2. **Demanar** el nom de l’usuari/ària.  
3. **Mostrar** un país de forma **aleatòria** i demanar que l'usuari/ària introdueixi la **capital** corresponent.  
4. **Sumar 1 punt** per cada resposta correcta.  
5. **Repetir** l’acció **10 vegades**.  
6. En acabar, **guardar** en un fitxer anomenat **classificacio.txt** el **nom de l’usuari/ària** i la seva **puntuació** total.


-----------------------------------

💻 Tecnologies Utilitzades

- Java SE 21 (o superior)
- IDE (IntelliJ IDEA)
- Terminal per a compilar i executar amb javac i java

-----------------------------------

📋 Requisits

- JDK 17 o superior instal·lat
- Variable d’entorn JAVA_HOME configurada
- Accés a terminal/command prompt
- Opcional: un IDE per facilitar l’execució

---

🛠️ Instal·lació

1. Clona aquest repositori:
```bash
git clone <URL-del-repositori>
cd <nom-de-l'exercici>
```
3. Accedeix al directori del projecte:
   ```bash
   cd <nom-de-l'exercici>
   ```
5. Comprova que tens Java instal·lat:
   ```bash
   java -version
   ```

-----------------------------------

▶️ Execució

1. Compila el projecte:
   ```bash
   javac *.java
   ```
3. Executa la classe principal:
   ```bash
   java <nom-de-la-classe>
   ```

🤝 Contribucions

Les contribucions són benvingudes! Si vols participar:
1. Fes un fork del repositori.
2. Crea una nova branca:
   ```bash
   git checkout -b feature/NovaFuncionalitat
   ```
4. Fes els teus canvis i commiteja’ls:
   ```bash
   git commit -m 'Afegeix Nova Funcionalitat'
   ```
5. Puja els canvis a la teva branca:
   ```bash
   git push origin feature/NovaFuncionalitat
   ```
6. Fes un pull request.
