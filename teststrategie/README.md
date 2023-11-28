# Teststrategie

## Aufgabe 1

### Abstrakte Testfälle

| Testfall | Beschreibung | Erwartetes Ergebnis |
|----------|--------------|----------------------|
| Fall 1   | Kaufpreis < 15'000 CHF | Kein Rabatt gewährt |
| Fall 2   | 15'000 CHF ≤ Kaufpreis ≤ 20'000 CHF | 5% Rabatt |
| Fall 3   | 20'000 CHF < Kaufpreis < 25'000 CHF | 7% Rabatt |
| Fall 4   | Kaufpreis ≥ 25'000 CHF | 8,5% Rabatt |

### Konkrete Testfälle

| Testfall | Kaufpreis | Erwartetes Ergebnis |
|----------|-----------|----------------------|
| Fall 1   | 10'000 CHF | Kein Rabatt |
| Fall 2   | 18'000 CHF | 5% Rabatt |
| Fall 3   | 21'000 CHF | 7% Rabatt |
| Fall 4   | 25'000 CHF | 8,5% Rabatt |

## Aufgabe 2

| ID | Beschreibung                   | Erwartet          | Effektiv          | Status | Ursache                  |
|----|---------------------------------|-------------------|-------------------|--------|--------------------------|
| 1  | Buchungsvorgang testen          | Erfolgreiche Buchung | Buchung fehlgeschlagen | Fehler | Fehlende Synchronisation |
| 2  | Login-Test                      | Erfolgreiche Anmeldung | Anmeldung fehlgeschlagen | Fehler | Falsche Anmeldedaten     |
| 3  | Fahrzeugsuche testen            | Liste verfügbarer Fahrzeuge | Keine Ergebnisse | Fehler | Suchalgorithmus-Problem  |
| 4  | Zahlungsprozess testen          | Erfolgreiche Zahlung | Zahlung fehlgeschlagen | Fehler | Problem mit Zahlungsanbieter |
| 5  | Stornierung einer Buchung testen| Erfolgreiche Stornierung | Stornierung fehlgeschlagen | Fehler | Ungültige Buchungsnummer |

## Aufgabe 3

### Testfälle für die Bank-Software

#### Black-Box Testfälle

| Beschreibung | Schritte | Erwartetes Ergebnis |
|--------------|----------|---------------------|
| Alle Konten anzeigen | Im Hauptmenü "a" eingeben | Liste aller Konten mit Nummern |
| Neues Konto erstellen | Im Hauptmenü "e" eingeben, gültige Eingaben für Namen und Währung machen | Ein neues Konto wird erstellt und die Details werden angezeigt |
| Kontodetails anzeigen | Eine gültige Kontonummer im Hauptmenü eingeben | Details des angegebenen Kontos |
| Geld einzahlen | Ein Konto auswählen, "e" für Einzahlung eingeben, einen gültigen Betrag angeben | Der Kontostand sollte um den eingegebenen Betrag erhöht werden |
| Geld abheben | Ein Konto auswählen, "a" für Abhebung eingeben, einen gültigen Betrag angeben | Der Kontostand sollte um den eingegebenen Betrag verringert werden |
| Wechselkurs überprüfen | Im Hauptmenü "w" eingeben | Nach eingeben der Währung wird der Wechselkurs angezeigt |

#### White-Box Testfälle

1. **Testen der Methoden der `Account`-Klasse:**
    - Ein Konto mit einem Anfangsguthaben erstellen.
    - Eine Einzahlung vornehmen und überprüfen, ob das Guthaben aktualisiert wird.
    - Einen Betrag abheben und überprüfen, ob das Guthaben aktualisiert wird.
    - Versuchen, einen Betrag abzuheben, der das Guthaben übersteigt und überprüfen, ob die Abhebung fehlschlägt.

2. **Testen der Methoden der `Bank`-Klasse:**
    - Mehrere Konten mit der Methode `createAccount` erstellen.
    - Überprüfen, ob die Liste der Konten nach der Kontoerstellung und -löschung aktualisiert wird.
    - Überprüfen, ob die Methode `getAccount` das richtige Konto abruft.

3. **Testen der Methoden der `Counter`-Klasse:**
    - Ein Konto mit der Methode `chooseAccount` auswählen und überprüfen, ob die ausgewählten Kontodetails angezeigt werden.
    - Die Methode `editAccount` testen, indem Geld eingezahlt, abgehoben und überwiesen wird.

4. **Testen der `ExchangeRateOkhttp`-Klasse:**
    - Die Methode `getExchangeRate` mit gültigen und ungültigen Währungen aufrufen.
    - Überprüfen, ob der Wechselkurs erfolgreich abgerufen wird.

#### Verbesserungen und Best Practices

1. **Kommentare im Code:**
    - Kommentare im Code sind nützlich, um ihn besser zu verstehen.
  
2. **Kapselung:**
    - Die `Account` Klasse auf Privat setzen und Getter erstellen.

3. **Validierung:**
    - Die Eingabe des Benutzers validieren, um ungültige Eingaben zu verhindern.

4. **Secrets**
    - Der API-Key sollte nicht im Code gespeichert werden.
