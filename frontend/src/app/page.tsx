export default async function Home() {
  const res = await fetch("http://localhost:8080");
  const message = await res.json();
  return <div>{message.message}</div>;
}
