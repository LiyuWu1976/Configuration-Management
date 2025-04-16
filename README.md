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

### Branch: `readme`
- [X] `README.md` erstellen mit:
  - Projektname & Gruppenmitgliedern
  - **TaskListe** (diese Liste hier übertragen)
  - Dokumentation der Projektstruktur

### Branch: `maven_detail`
- [ ] `pom.xml` erweitern:
  - Notwendige Abhängigkeiten hinzufügen
  - Entwickler:innen-Infos aller Mitglieder eintragen
  - Git-Repository-URL hinterlegen

### Branch: `bug_hunt`
- [ ] 3 Fehler im vorhandenen Code finden und korrigieren
- [ ] Korrekturen in **separaten Commits** dokumentieren

### Branch: `drink`
- [ ] Klasse `Cocktail` erstellen (implementiert `Drink`-Interface)
  - Konstruktor mit `String name` und `List<Liquid> ingredients`
  - Funktionalität für beliebige Zutaten implementieren

### Branch: `queue`
- [ ] Klasse `DrinkQueue` implementieren (verwaltet `Drink`-Objekte)
  - Methoden auf Teammitglieder aufteilen
  - Jedes Mitglied arbeitet in **eigenem Sub-Branch** (`queue_mitgliedname`)
  - Sub-Branches in `queue` mergen

### Branch: `javadoc`
- [ ] JavaDoc für **alle Klassen/Methoden** erstellen:
  - Vorhandene Klassen aus der Vorlage
  - Neu implementierte Klassen (`Cocktail`, `DrinkQueue`)

### Branch: `tests`
- [ ] Tests für alle Klassen erstellen (100% Coverage)
  - Testdateien nach Schema `ClassNameTest.java` benennen
  - `mvn test` muss fehlerfrei laufen
  - Jacoco-Report generieren

### Branch: `double_queue` (nur für 3er-Gruppen)
- [ ] Klasse `DoubleQueue` implementieren (für `double`-Werte)
  - Tests und JavaDoc ebenfalls ergänzen

### Branch: `maven_site`
- [ ] Maven-Site konfigurieren (`pom.xml`)
- [ ] Projektinfos und Teststatistiken integrieren
- [ ] Pro Mitglied eine `memberX.md` mit Beitragsbeschreibung erstellen
- [ ] `mvn site` erfolgreich ausführen

### Abschluss
- [ ] **Alle Branches** in `main` mergen
- [ ] Commit-History prüfen (`git log --oneline --graph --all`)
- [ ] GitHub-Repository auf Vollständigkeit kontrollieren
- [ ] Repository-Link in Moodle abgeben






