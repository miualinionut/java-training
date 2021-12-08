1. Template Pattern -
Am realizat un scenariu in care am primit urmatoarea sarcina de la un client :
Un program generator de site-uri despre un anume subiect ales (Motorul Diesel)
In urma apasarii butonului de rulare, utilizatorului(clientului)
 i se dau la dispozitie 2 optiuni : creeaza un site basic gata generat despre motorul diesel
 sau creeaza un site custom in care i se cer diverse date despre continut
In urma alegerii, programul generaza cod html intr-un fisier, care spre exemplu, poate fi 
deschid cu Mozilla Firefox. In urma generarii altui site, fisierul va fi suprascris 
cu noul cod.

2. Builder Pattern -
Am realizat o mini "aplicatie" care este responsabila de crearea unei pizze.
Ideea din spatele mini aplicatiei se poate folosi si la o aplicatie precum Glovo.
In timpul folosirii programului , utilizatorul este intrebat ce ingrediente sa contina
pizza. Cateva dintre ingrediente sunt obligatorii. Pe parcursul alegerilor, se va printa
pretul curent. La final pizza este scrisa intr-un fisier, care 
poate fi considerat un repository de comenzi de la un magazin . 