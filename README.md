# games
Simple games I've made in my spare time

## Run MegaCasino

### Quick Start (Linux/macOS)

```bash
chmod +x run.sh build.sh
./run.sh
```

Build a packaged executable:

```bash
./build.sh
./package/MegaCasino/bin/MegaCasino
```

### Option 1: Run from source

Requirements:
- Java 21+ installed

Commands:

```bash
javac MegaCasino.java
java MegaCasino
```

### Option 2: Run packaged executable (Linux)

If the packaged app already exists in this repo:

```bash
./package/MegaCasino/bin/MegaCasino
```

### Build the packaged executable yourself (Linux)

```bash
rm -rf dist package
mkdir -p dist/input package
javac -d dist/input MegaCasino.java
jar --create --file dist/MegaCasino.jar --main-class MegaCasino -C dist/input .
jpackage --type app-image --name MegaCasino --input dist --main-jar MegaCasino.jar --main-class MegaCasino --dest package
```
