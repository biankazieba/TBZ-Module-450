# Teststrategie

## Aufgabe 1

### Abstrakte Testfälle

| Testfall | Beschreibung | Erwartetes Ergebnis |
|----------|--------------|----------------------|
| Fall 1   | Kaufpreis < 10'000 CHF | Kein Rabatt gewährt |
| Fall 2   | 10'000 CHF ≤ Kaufpreis ≤ 15'000 CHF | 5% Rabatt |
| Fall 3   | 15'000 CHF < Kaufpreis < 20'000 CHF | 7% Rabatt |
| Fall 4   | Kaufpreis ≥ 20'000 CHF | 8,5% Rabatt |

### Konkrete Testfälle

| Testfall | Kaufpreis | Erwartetes Ergebnis |
|----------|-----------|----------------------|
| Fall 1   | 8'000 CHF | Kein Rabatt |
| Fall 2   | 12'000 CHF | 5% Rabatt |
| Fall 3   | 18'000 CHF | 7% Rabatt |
| Fall 4   | 22'000 CHF | 8,5% Rabatt |

## Aufgabe 2

| ID | Beschreibung                   | Erwartet          | Effektiv          | Status | Ursache                  |
|----|---------------------------------|-------------------|-------------------|--------|--------------------------|
| 1  | Buchungsvorgang testen          | Erfolgreiche Buchung | Buchung fehlgeschlagen | Fehler | Fehlende Synchronisation |
| 2  | Login-Test                      | Erfolgreiche Anmeldung | Anmeldung fehlgeschlagen | Fehler | Falsche Anmeldedaten     |
| 3  | Fahrzeugsuche testen            | Liste verfügbarer Fahrzeuge | Keine Ergebnisse | Fehler | Suchalgorithmus-Problem  |
| 4  | Zahlungsprozess testen          | Erfolgreiche Zahlung | Zahlung fehlgeschlagen | Fehler | Problem mit Zahlungsanbieter |
| 5  | Stornierung einer Buchung testen| Erfolgreiche Stornierung | Stornierung fehlgeschlagen | Fehler | Ungültige Buchungsnummer |
