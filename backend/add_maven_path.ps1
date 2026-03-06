$mavenBin = "$env:USERPROFILE\maven\apache-maven-3.9.6\bin"
$currentPath = [System.Environment]::GetEnvironmentVariable('PATH', 'User')
if ($currentPath -notlike "*$mavenBin*") {
    [System.Environment]::SetEnvironmentVariable('PATH', "$currentPath;$mavenBin", 'User')
    Write-Host "Maven added to user PATH permanently."
} else {
    Write-Host "Maven already in PATH."
}
