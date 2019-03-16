/**
 * CotizacionGeneralSoap_PortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package arg.mps.seguros.broker.api.integration.ans.client.cotizacion;

public interface CotizacionGeneralSoap_PortType extends java.rmi.Remote {
    public arg.mps.seguros.broker.api.integration.ans.client.cotizacion.RetornoCotizacion retornaCotizaAuto(java.lang.String cotizacionID) throws java.rmi.RemoteException;
    public arg.mps.seguros.broker.api.integration.ans.client.cotizacion.RetornoCotizacion retornaCotizaHogar(java.lang.String cotizacionID) throws java.rmi.RemoteException;
    public arg.mps.seguros.broker.api.integration.ans.client.cotizacion.RetornoCotizacion retornaCotizaAsistencia(java.lang.String cotizacionID) throws java.rmi.RemoteException;
    public arg.mps.seguros.broker.api.integration.ans.client.cotizacion.RetornoCotizacion cotizaAuto(java.lang.String rut, int edad, int marca, int modelo, int ano, float porcentajeDescuento, int tipoVehiculo, arg.mps.seguros.broker.api.integration.ans.client.cotizacion.DatosMultiplesDescuentos datosMultiplesDescuentos, int comuna, int uso, int sexo, java.lang.String mejoraVR, java.lang.String RCexceso, int propietario) throws java.rmi.RemoteException;
    public arg.mps.seguros.broker.api.integration.ans.client.cotizacion.RetornoCotizacion cotizaHogar(java.lang.String rut, float valorInmueble, float valorContenido, int claseConstruccionID, java.lang.String direccion, int comuna, float porcentajeDescuento, arg.mps.seguros.broker.api.integration.ans.client.cotizacion.DatosMultiplesDescuentos datosMultiplesDescuentos, int numeroPisos, int antiguedadConstruccionID, int tieneHipotecario) throws java.rmi.RemoteException;
    public arg.mps.seguros.broker.api.integration.ans.client.cotizacion.RetornoCotizacion cotizaAsistencia(java.lang.String rut, java.util.Calendar fechaInicio, java.util.Calendar fechaTermino, int paisOrigen, int paisDestino, int pasajeros, boolean viajaSolo, float porcentajeDescuento, arg.mps.seguros.broker.api.integration.ans.client.cotizacion.DatosMultiplesDescuentos datosMultiplesDescuentos, arg.mps.seguros.broker.api.integration.ans.client.cotizacion.DatosMultiplesAsegurados datosMultiplesAseg) throws java.rmi.RemoteException;
    public arg.mps.seguros.broker.api.integration.ans.client.cotizacion.RetornoCotizacion cotizaRCPersonal(java.lang.String rutAsegurado, java.lang.String apellidoPAsegurado, java.lang.String apellidoMAsegurado, java.lang.String nombreAsegurado, java.lang.String direccion, java.lang.String comuna, int cantPersona, int cantAutos, int formaPago, int numeroCuotas) throws java.rmi.RemoteException;
}
