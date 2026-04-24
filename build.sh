#!/usr/bin/env bash
set -euo pipefail

SCRIPT_DIR="$(cd "$(dirname "${BASH_SOURCE[0]}")" && pwd)"
cd "$SCRIPT_DIR"

if ! command -v jpackage >/dev/null 2>&1; then
  echo "Error: jpackage was not found. Install JDK 14+ (JDK 21 recommended)."
  exit 1
fi

rm -rf dist package
mkdir -p dist/input package

javac -d dist/input MegaCasino.java
jar --create --file dist/MegaCasino.jar --main-class MegaCasino -C dist/input .
jpackage --type app-image --name MegaCasino --input dist --main-jar MegaCasino.jar --main-class MegaCasino --dest package

echo "Build complete. Run with: ./package/MegaCasino/bin/MegaCasino"
