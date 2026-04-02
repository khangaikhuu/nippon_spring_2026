#!/bin/bash

PROJECT=$1

mkdir "$PROJECT"
cd "$PROJECT"
mkdir src docs tests

cat > README.md << EOF
# $PROJECT
Author: $(whoami)
Date: $(date '+%Y-%m-%d)

## About
This project was created with setup-project.sh

EOF

git init
git add .
git commit -m "Initial commit"

echo ""
echo "✓ Created project: $PROJECT"
echo "✓ Folders: src/ docs/ tests/"
echo "✓ README.md created"
echo "✓ Git initialized"
echo "✓ Initial commit done"
echo ""
echo "Project $PROJECT is ready!"


