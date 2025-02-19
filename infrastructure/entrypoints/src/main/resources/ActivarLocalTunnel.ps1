# ActivarLocalTunnel.ps1

$port = 8080
$subdomain = "corsanapi"

# Verificar si el túnel está en ejecución
$checkTunnel = & lt --port $port --subdomain $subdomain
if ($checkTunnel -match "your url is: https://$subdomain.loca.lt")
{
    Write-Host "LocalTunnel está en ejecución en https://$subdomain.loca.lt"
}
else
{
    # Iniciar el túnel si no está en ejecución
    &  npx localtunnel --port $port --subdomain $subdomain
    Write-Host "LocalTunnel iniciado en el puerto $port con el subdominio $subdomain"
}
