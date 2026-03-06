$env:Path += ";$env:USERPROFILE\maven\apache-maven-3.9.6\bin"
$output = & mvn spring-boot:run --batch-mode 2>&1
$output | Out-File -FilePath "C:\Users\vijuv\OneDrive\Desktop\Form\backend\run_ascii.log" -Encoding ASCII
Write-Host "Done. Lines:"
$output | Where-Object { $_ -match "ERROR|Exception|error|FAILED|BUILD" } | Write-Host
