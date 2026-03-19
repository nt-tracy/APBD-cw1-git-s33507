· 1. Kiedy Git wykona fast-forward, a kiedy powstaje merge commit?
Fast-forward będzie, gdy na gałęzi main nie powstały w międzyczasie żadne dodatkowe commity i gałąź jest po prostuj przedłużeniem gałęzi main.
Merge commit powstaje, gdy na gałęzi main pojawiły się w międzyczasie inne commity i wtedy git dodaje nowy commit, który będzie łączył sytuacje z gałęzi main i dodatkowej dołączonej.

· 2. Czym w praktyce różni się merge od rebase?
W merge zachowujemy pełną historię zmian, a rebase zmienia historię "prostując ją" na prostoliniową.

· 3. W jaki sposób został rozwiązany konflikt w Twoim repozytorium?
Rozwiązałam go ręcznie - w pliku projektu pokazał się fragment konfliktowy z odpowiednimi nagłówkami i usuwając niepotrzebne elementy zostawiłam wersję poprawną.
Na końcu dodałam zmiany do repozytorium i dołączyłam do repozytorium zdalnego.
