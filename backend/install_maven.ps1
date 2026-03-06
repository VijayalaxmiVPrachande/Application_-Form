Invoke-WebRequest -Uri "https://repo.maven.apache.org/maven2/org/apache/maven/apache-maven/3.9.6/apache-maven-3.9.6-bin.zip" -OutFile "$env:USERPROFILE\maven.zip" -UseBasicParsing
Write-Host "Download complete"
Expand-Archive -Path "$env:USERPROFILE\maven.zip" -DestinationPath "$env:USERPROFILE\maven" -Force
Write-Host "Extraction complete"
