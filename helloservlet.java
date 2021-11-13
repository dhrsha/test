import.java.io.*;
import.javax.servlet.http.*;
import.javax.servlet.http.*;
public class hellosservlet extends httpservlrt
{
publice void doget(httpservletrequest req,httpservletresponse res)throws servletexception,ioexpection
{
res.setcontentTYPE("text/html");
printwriter out=res.getwriter();
out.println("<html><body>WELCOME</body></html>");
}
}
