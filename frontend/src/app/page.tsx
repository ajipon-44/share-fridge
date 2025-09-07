export default async function Home() {
  const res = await fetch(`${process.env.API_URL}`, { cache: "no-store" });
  const message = await res.json();
  return <div>{message.message}</div>;
}
