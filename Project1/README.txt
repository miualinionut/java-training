Puiu Sebastian-Andrei

Explicatii functionalitate:

-> Aceasta aplicatie simuleaza actiunile pe care le poate face un client al unei banci;
-> Ea tine evidenta tuturor conturilor utilizatorilor si inregistreaza fiecare modificare;
-> In cadrul aceste teme am folosit atat concepte de OOP (precum mostenirea), cat si diverse design patterns (precum Factory, Command, Builder, Singleton);
-> Factory a fost folosit aici pentru a crea carduri in functie de banca dorita;
-> Singleton a fost folosit pentru a ma asigura ca este creata o singura instanta a lui Factory;
-> Builder si Command au fost utilizate pentru a-i putea oferi clientului posibilitatea de "execute" a urmatoarele actiuni:

- posibilitatea de a extrage bani (comanda de tip ATM)
- posibilitatea de a depune bani (comanda de tip ATM)

- posibilitatea de a crea un card (comanda de tip banca)
- posibilitatea de a elimina un card (comanda de tip banca)

- posibilitatea de a schimba codul PIN (comanda de tip online)
- posibilitatea de a transfera bani intre 2 carduri ale aceluiasi utilizator (comanda de tip online)
- posibilitatea de a transfera bani intre cardurile a 2 utilizatori diferiti (comanda de tip online)

-> Comenzile de tip online au si optiunea de "undo", in caz ca utilizatorul a comis o greseala;
-> Majoritatea comenzilor legate de un card necesita introducerea PIN-ului sau, acesta fiind ales inca de la crearea sa;
-> In cazul in care un cod PIN este gresit, se va afisa mesaj de eroare;
-> In cazul in care un utilizator doreste sa scoata/transfere o suma de bani mai mare decat sold-ul sau curent, se va afisa un mesaj de eroare;
