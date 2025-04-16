# Projektnamen: drink
### Aufgaben: Gruppenübung 07
## Namen aller Gruppenmitglieder
* Gruppenmitglieder1: Liyu Wu
* Gruppenmitglieder2: Ali Zolfaghari

## Taskliste


### Allgemeine Vorbereitung
- [X] Übungsanleitung **vollständig durchlesen** und Verständnis sicherstellen
- [X] Gruppe bilden (2-3 Personen, 3er-Gruppen beachten erweiterte Aufgaben)
- [X] Kommunikationsplattform einrichten (Whatsapp)

### Repository Setup
- [X] **Neues GitHub-Repository** erstellen 
- [X] Projektordnerstruktur anlegen (Maven-Projekt im Repository-Root)
- [X] Maven-Projekt initialisieren (`pom.xml`)

### Branch: `maven`
- [X] Vorlagedateien (aus ZIP) in `src/main/java/at/fhj/msd/` integrieren
- [X] `.gitignore` erstellen (generierte Dateien ausschließen)
- [X] **Best Practices** für Git-Commit-Nachrichten beachten
- [X] push Branch 'maven' auf den remote Server
- [X] merge Branch 'maven' zurück in den main Branch

### Branch: `readme`
- [X] `README.md` erstellen mit:
  - Projektname & Gruppenmitgliedern
  - **TaskListe** (diese Liste hier übertragen)
  - Dokumentation der Projektstruktur

- [X] push Branch 'readme' auf den remote Server
- [X] merge Branch 'readme' zurück in den main Branch

### Branch: `maven_detail`
- [ ] `pom.xml` erweitern:
  - Notwendige Abhängigkeiten hinzufügen
  - Entwickler:innen-Infos aller Mitglieder eintragen
  - Git-Repository-URL hinterlegen
- [X] push Branch 'maven_detail' auf den remote Server
- [X] merge Branch 'maven_detail' zurück in den main Branch

### Branch: `bug_hunt`
- [ ] 3 Fehler im vorhandenen Code finden und korrigieren
- [ ] Korrekturen in **separaten Commits** dokumentieren

- [X] push Branch 'bug_hunt' auf den remote Server
- [X] merge Branch 'bug_hunt' zurück in den main Branch

### Branch: `drink`
- [ ] Klasse `Cocktail` erstellen (implementiert `Drink`-Interface)
  - Konstruktor mit `String name` und `List<Liquid> ingredients`
  - Funktionalität für beliebige Zutaten implementieren

- [X] push Branch 'drink' auf den remote Server
- [X] merge Branch 'drink' zurück in den main Branch

### Branch: `queue`
- [ ] Klasse `DrinkQueue` implementieren (verwaltet `Drink`-Objekte)
  - Methoden auf Teammitglieder aufteilen
  - Jedes Mitglied arbeitet in **eigenem Sub-Branch** (`queue_mitgliedname`)
  - Sub-Branches in `queue` mergen
- [X] push Branch 'queue' auf den remote Server
- [X] merge Branch 'queue' zurück in den main Branch

### Branch: `javadoc`
- [ ] JavaDoc für **alle Klassen/Methoden** erstellen:
  - Vorhandene Klassen aus der Vorlage
  - Neu implementierte Klassen (`Cocktail`, `DrinkQueue`)
- [X] push Branch 'javadoc' auf den remote Server
- [X] merge Branch 'javadoc' zurück in den main Branch

### Branch: `tests`
- [ ] Tests für alle Klassen erstellen (100% Coverage)
  - Testdateien nach Schema `ClassNameTest.java` benennen
  - `mvn test` muss fehlerfrei laufen
  - Jacoco-Report generieren
- [X] push Branch 'tests' auf den remote Server
- [X] merge Branch 'tests' zurück in den main Branch


### Branch: `maven_site`
- [ ] Maven-Site konfigurieren (`pom.xml`)
- [ ] Projektinfos und Teststatistiken integrieren
- [ ] Pro Mitglied eine `memberX.md` mit Beitragsbeschreibung erstellen
- [ ] `mvn site` erfolgreich ausführen
- [X] push Branch 'maven_site' auf den remote Server
- [X] merge Branch 'maven_site' zurück in den main Branch

### Abschluss
- [ ] **Alle Branches** in `main` mergen
- [ ] Commit-History prüfen (`git log --oneline --graph --all`)
- [ ] GitHub-Repository auf Vollständigkeit kontrollieren
- [ ] Repository-Link in Moodle abgeben






