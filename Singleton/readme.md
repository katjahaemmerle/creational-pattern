Als erstes wollen wir in der Singleton Klasse unseren AccountManager (= der Singleton) threadsicher erzeugen (�ber die getInstance() Methode).
Die AccountManager Klasse hat 2 Methoden 
	Eine die �berweisungen handhabt (also den Credit Wert ver�ndert)
	Eine die den Betrag am Konto zur�ckliefert

Die 2 Clients haben jeweils eigene Funktionen
	Mit dem Desktop Client k�nnen wir lediglich Geld �ber den AccountManager einzahlen
	Mit dem Mobilen Client k�nnen wir �ber den AccountManager Geld abbuchen und uns den Kontostand ausgeben lassen. 

In der Bilanz Klasse wollen wir beide Clients Instanziieren, dann einen Betrag ein- und anschlie�end auszahlen. Dazwischen und danach wollen wir den Kontostand ausgeben lassen, um zu �berpr�fen ob alles funktioniert hat. 